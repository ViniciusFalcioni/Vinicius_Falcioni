package org.bortoli.infra.celcoin.repositories;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bortoli.domain.dto.PixQrCodeDTO;
import org.bortoli.domain.repositories.IPixRepository;
import org.bortoli.infra.celcoin.dto.*;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.UUID;

@ApplicationScoped
public class CcPixRepository implements IPixRepository {
    @Inject
    @RestClient
    CcRestClient restClient;

    public PixQrCodeDTO create(PixQrCodeDTO dto) {
        CcTokenRequestDTO tokenRequestDTO = new CcTokenRequestDTO();
        CcTokenResponseDTO tokenResponseDTO = this.restClient.getToken(tokenRequestDTO.getClient_id(), tokenRequestDTO.getGrant_type(), tokenRequestDTO.getClient_secret());
        String token = "Bearer ".concat(tokenResponseDTO.getAccess_token());
        CcPixRequestDTO ccPixRequestDTO = this.getCcPixRequestDTO(dto);
        CcPixResponseDTO qrCodeResponseDTO = this.restClient.createStaticPix(token, ccPixRequestDTO);
        dto.setId(UUID.randomUUID().toString());
        dto.setTransactionIdentification(qrCodeResponseDTO.getTransactionIdentification());
        dto.setQrCode(qrCodeResponseDTO.getEmvqrcps());
        return dto;
    }

    private CcPixRequestDTO getCcPixRequestDTO(PixQrCodeDTO dto) {
        CcMerchantDTO merchantDTO = new CcMerchantDTO();
        CcPixRequestDTO ccPixRequestDTO = new CcPixRequestDTO();
        merchantDTO.setPostalCode(dto.getPostalCode());
        merchantDTO.setCity(dto.getCity());
        merchantDTO.setName(dto.getMerchantName());
        merchantDTO.setMerchantCategoryCode("5651");
        ccPixRequestDTO.setKey(dto.getKey());
        ccPixRequestDTO.setTransactionIdentification("pixqrcodegerado");
        ccPixRequestDTO.setAdditionalInformation(dto.getDescription());
        ccPixRequestDTO.setMerchant(merchantDTO);
        ccPixRequestDTO.setAmount(dto.getAmount());
        return ccPixRequestDTO;
    }
}
