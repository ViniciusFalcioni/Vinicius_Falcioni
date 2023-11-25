package com.fag.domain.mappers;

import java.util.UUID;

import com.fag.domain.dto.PixCelcoinDTO;
import com.fag.domain.entities.PixCelcoinBO;

public class PixCelcoinMapper {
    
    public static PixCelcoinBO toBO(PixCelcoinDTO dto) {
        return new PixCelcoinBO(dto.getId() != null ? UUID.fromString(dto.getId()) : null, dto.getKey(),
                dto.getAmount(),
                dto.getQRCode(), dto.getTransactionId());
    }
    public static PixCelcoinDTO toDTO(PixCelcoinBO bo) {
        PixCelcoinDTO dto = new PixCelcoinDTO();
        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionId(bo.getTransactionId());
        return dto;
    }
}
