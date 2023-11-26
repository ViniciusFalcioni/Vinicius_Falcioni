package org.fag.trab.infra.celcoin.repositories;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.fag.trab.domain.dto.MerchantDto;
import org.fag.trab.domain.dto.PixDto;
import org.fag.trab.domain.repositories.IPixRepository;
import org.fag.trab.infra.celcoin.dto.MerchantCelcoinDto;
import org.fag.trab.infra.celcoin.dto.PixCelcoinDto;
import org.fag.trab.infra.celcoin.dto.PixCelcoinResponseDto;
import org.fag.trab.infra.celcoin.dto.TokenCelcoinDto;

@ApplicationScoped
public class PixCelcoinRepository implements IPixRepository {
    @Inject
    @RestClient
    RestClientCelcoin restClientCelcoin;

    public PixDto generate(PixDto pixDTO) {
        String authToken = "Bearer ".concat(getToken());

        MerchantDto merchantDto = pixDTO.getMerchant();

        MerchantCelcoinDto merchantCelcoinDTO = new MerchantCelcoinDto();
        merchantCelcoinDTO.setPostalCode(merchantDto.getPostalCode());
        merchantCelcoinDTO.setCity(merchantDto.getCity());
        merchantCelcoinDTO.setName(merchantDto.getName());
        merchantCelcoinDTO.setMerchantCategoryCode("5651");

        PixCelcoinDto pixCelcoinDTO = new PixCelcoinDto();

        pixCelcoinDTO.setAdditionalInformation(pixDTO.getDescription());
        pixCelcoinDTO.setKey(pixDTO.getKey());
        pixCelcoinDTO.setTransactionIdentification("pixteste");
        pixCelcoinDTO.setAmount(pixDTO.getAmount());
        pixCelcoinDTO.setMerchant(merchantCelcoinDTO);

        PixCelcoinResponseDto qrCodeResponseDTO = restClientCelcoin.generatePix(authToken, pixCelcoinDTO);

        pixDTO.setTransactionIdentification(qrCodeResponseDTO.getTransactionIdentification());
        pixDTO.setQrCode(qrCodeResponseDTO.getEmvqrcps());

        return pixDTO;
    }

    private String getToken() {
        Form tokenForm = new Form();

        String client_id = "41b44ab9a56440.teste.celcoinapi.v5";
        String grant_type = "client_credentials";
        String client_secret = "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3";

        tokenForm.param("client_id", client_id);
        tokenForm.param("grant_type", grant_type);
        tokenForm.param("client_secret", client_secret);

        TokenCelcoinDto token = restClientCelcoin.getToken(tokenForm);

        return token.getAccess_token();
    }
}
