package com.fag.domain.mappers;

import java.util.UUID;

import com.fag.domain.dto.PixQrCodeDTO;
import com.fag.domain.entities.PixQrcodeBO;

public class PixQrCodeMapper {

  public static PixQrcodeBO toBO(PixQrCodeDTO dto) {
    return new PixQrcodeBO(dto.getId() != null ? UUID.fromString(dto.getId()) : null, dto.getKey(), dto.getAmount(), dto.getQrCode(), dto.getTransactionId());
  }

  public static PixQrCodeDTO toDTO(PixQrcodeBO bo) {
    PixQrCodeDTO dto = new PixQrCodeDTO();

    dto.setId(bo.getId() != null ? bo.getId().toString() : null);
    dto.setKey(bo.getKey());
    dto.setAmount(bo.getAmount());
    dto.setQrCode(bo.getQrCode());
    dto.setTransactionId(bo.getTransactionId());

    return dto;
  }
}
