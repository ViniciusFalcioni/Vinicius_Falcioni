package org.bortoli.domain.mappers;

import org.bortoli.domain.dto.PixQrCodeDTO;
import org.bortoli.domain.entities.PixQrCodeBO;

public class PixQrCodeMapper {
    public static PixQrCodeDTO toDTO(PixQrCodeBO bo) {
        PixQrCodeDTO dto = new PixQrCodeDTO();
        dto.setId(bo.getId().toString());
        dto.setAmount(bo.getAmount());
        dto.setCity(bo.getCity());
        dto.setKey(bo.getKey());
        dto.setDescription(bo.getDescription());
        dto.setMerchantName(bo.getMerchantName());
        dto.setPostalCode(bo.getPostalCode());
        return dto;
    }

    public static PixQrCodeBO toBO(PixQrCodeDTO dto) {
        return new PixQrCodeBO(dto.getId(), dto.getKey(), dto.getPostalCode(), dto.getCity(), dto.getMerchantName(), dto.getDescription(), dto.getQrCode(), dto.getAmount());
    }
}
