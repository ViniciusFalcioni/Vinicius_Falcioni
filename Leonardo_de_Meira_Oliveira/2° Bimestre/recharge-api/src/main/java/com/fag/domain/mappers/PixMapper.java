package com.fag.domain.mappers;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;

import java.util.UUID;

public class PixMapper {

    public static PixBO toBO(PixDTO dto) {
        return new PixBO(
                dto.id() != null ? UUID.fromString(dto.id()) : UUID.randomUUID(),
                dto.key(),
                dto.amount(),
                dto.qrCode(),
                dto.transactionId());
    }

    public static PixDTO toDTO(PixBO bo) {
        return new PixDTO(
                bo.id() != null ? bo.id().toString() : null,
                bo.key(),
                bo.amount(),
                bo.qrCode(),
                null,
                bo.transactionId());
    }

}