package com.github.faening.infra.celcoin.repository;

import com.github.faening.domain.dto.PixQrCodeDTO;
import com.github.faening.domain.repositories.IPixRepository;
import com.github.faening.infra.celcoin.dto.CelcoinCreateStaticQrCodeRequestDTO;
import com.github.faening.infra.celcoin.dto.CelcoinCreateStaticQrCodeResponseDTO;
import com.github.faening.infra.celcoin.dto.CelcoinTokenRequestDTO;
import com.github.faening.infra.celcoin.dto.CelcoinTokenResponseDTO;
import com.github.faening.infra.celcoin.mappers.CelcoinPixQrCodeMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class CelcoinPixRepository implements IPixRepository {
    @Inject
    @RestClient
    CelcoinRestClient celcoinRestClient;

    @Override
    public PixQrCodeDTO create(PixQrCodeDTO pixQrCodeDTO) {
        // Solicita o token de acesso
        CelcoinTokenResponseDTO tokenResponseDTO = getToken();

        // Cria um CelcoinCreateStaticQrCodeRequestDTO a partir do pixQrCodeRequestDTO
        CelcoinCreateStaticQrCodeRequestDTO staticQrCodeRequestDTO = CelcoinPixQrCodeMapper.toStaticQrCodeRequestDTO(pixQrCodeDTO);

        // Cria o QR Code estático
        CelcoinCreateStaticQrCodeResponseDTO staticQrCodeResponseDTO = celcoinRestClient.createStaticQrCode(
            "Bearer ".concat(tokenResponseDTO.getTokenType()),
            staticQrCodeRequestDTO);

        // Atualiza os dados do QR code antes de retornar
        // Falta atualizar o id
        pixQrCodeDTO.setEmvqrcps(staticQrCodeResponseDTO.getEmvqrcps());
        pixQrCodeDTO.setTransactionId(staticQrCodeRequestDTO.getTransactionIdentification());

        return pixQrCodeDTO;
    }

    private CelcoinTokenResponseDTO getToken() {
        CelcoinTokenRequestDTO tokenRequestDTO = new CelcoinTokenRequestDTO();
        return celcoinRestClient.getToken(
            tokenRequestDTO.getClientId(),
            tokenRequestDTO.getGrantType(),
            tokenRequestDTO.getClientSecret()
        );
    }
}
