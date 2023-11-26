package org.apicellcoin.domain.mappers;

import java.util.UUID;

import org.apicellcoin.domain.dto.PixCelcoinDTO;
import org.apicellcoin.domain.entities.CelcoinPixBO;

public class CelcoinPixMapper {

    public static CelcoinPixBO toBO(PixCelcoinDTO dto) {
        return new CelcoinPixBO(dto.getId() != null ? UUID.fromString(dto.getId()) : null, dto.getKey(),
                dto.getAmount(),
                dto.getQRCode(), dto.getTransactionId());
    }

    public static PixCelcoinDTO toDTO(CelcoinPixBO bo) {
        PixCelcoinDTO dto = new PixCelcoinDTO();

        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionId(bo.getTransactionId());

        return dto;
    }

}