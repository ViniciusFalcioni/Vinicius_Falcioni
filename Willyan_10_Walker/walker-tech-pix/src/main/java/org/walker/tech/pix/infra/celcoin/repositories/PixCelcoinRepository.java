package org.walker.tech.pix.infra.celcoin.repositories;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.walker.tech.pix.domain.dto.MerchantDto;
import org.walker.tech.pix.domain.dto.PixDto;
import org.walker.tech.pix.domain.repositories.IPixRepository;
import org.walker.tech.pix.infra.celcoin.dto.MerchantCelcoinDto;
import org.walker.tech.pix.infra.celcoin.dto.PixCelcoinDto;
import org.walker.tech.pix.infra.celcoin.dto.PixCelcoinResponseDto;
import org.walker.tech.pix.infra.celcoin.dto.TokenCelcoinDto;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;

@ApplicationScoped
public class PixCelcoinRepository implements IPixRepository {

    @Inject
    @RestClient
    RestClient restClientCelcoin;
    public PixDto generate(PixDto pixDTO) {
        String authToken = getToken();
    
        if (authToken == null) {
            return pixDTO; // Retornar o DTO original se não houver token válido
        }
    
        MerchantCelcoinDto merchantCelcoinDTO = createMerchantCelcoinDTO(pixDTO.getMerchant());
        if (merchantCelcoinDTO == null) {
            return pixDTO; // Retornar o DTO original se não houver informações de comerciante
        }
    
        PixCelcoinDto pixCelcoinDTO = createPixCelcoinDTO(pixDTO, merchantCelcoinDTO);
        if (pixCelcoinDTO == null) {
            return pixDTO; // Retornar o DTO original se não for possível criar o DTO para o Celcoin
        }
    
        PixCelcoinResponseDto qrCodeResponseDTO = RestClientCelcoin.generatePix(authToken, pixCelcoinDTO);
    
        if (qrCodeResponseDTO != null) {
            pixDTO.setTransactionIdentification(qrCodeResponseDTO.getTransactionIdentification());
            pixDTO.setQrCode(qrCodeResponseDTO.getEmvqrcps());
        }
    
        return pixDTO;
    }
    
    private MerchantCelcoinDto createMerchantCelcoinDTO(MerchantDto merchantDto) {
        if (merchantDto == null) {
            return null;
        }
    
        MerchantCelcoinDto merchantCelcoinDTO = new MerchantCelcoinDto();
        merchantCelcoinDTO.setPostalCode(merchantDto.getPostalCode());
        merchantCelcoinDTO.setCity(merchantDto.getCity());
        merchantCelcoinDTO.setName(merchantDto.getName());
        merchantCelcoinDTO.setMerchantCategoryCode("5651");
    
        return merchantCelcoinDTO;
    }
    
    private PixCelcoinDto createPixCelcoinDTO(PixDto pixDTO, MerchantCelcoinDto merchantCelcoinDTO) {
        if (pixDTO == null || merchantCelcoinDTO == null) {
            return null;
        }
    
        PixCelcoinDto pixCelcoinDTO = new PixCelcoinDto();
        pixCelcoinDTO.setAdditionalInformation(pixDTO.getDescription());
        pixCelcoinDTO.setKey(pixDTO.getKey());
        pixCelcoinDTO.setTransactionIdentification("pixteste");
        pixCelcoinDTO.setAmount(pixDTO.getAmount());
        pixCelcoinDTO.setMerchant(merchantCelcoinDTO);
    
        return pixCelcoinDTO;
    }

    private String getToken() {
        String client_id = "41b44ab9a56440.teste.celcoinapi.v5";
        String grant_type = "client_credentials";
        String client_secret = "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3";

        Form tokenForm = new Form();
        tokenForm.param("client_id", client_id);
        tokenForm.param("grant_type", grant_type);
        tokenForm.param("client_secret", client_secret);

        TokenCelcoinDto token = ((RestClientCelcoin) restClientCelcoin).getToken(tokenForm);

        if (token != null) {
            return token.getAccessToken();
        }

        return null;
    }
}
