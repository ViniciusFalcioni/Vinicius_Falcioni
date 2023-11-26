package com.fag.domain.mappers;

import java.util.UUID;

import com.fag.domain.dto.QrcodePixDTO;
import com.fag.domain.entities.QrcodePixBO;

public class QrcodePixMapper {

    public static QrcodePixBO toBO(QrcodePixDTO dto) {
        return new QrcodePixBO(dto.getId() != null ? UUID.fromString(dto.getId()) : null, dto.getKey(), dto.getAmount(),
                dto.getQrCode(), dto.getTransactionId(), dto.getAdditionalInformation());
    }

    public static QrcodePixDTO toDTO(QrcodePixBO bo) {
        QrcodePixDTO dto = new QrcodePixDTO();

        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionId(bo.getTransactionId());
        dto.setAdditionalInformation(bo.getAdditionalInformation());

        return dto;
    }
}