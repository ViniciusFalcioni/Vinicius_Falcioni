package com.fag.domain.mappers;

import com.fag.domain.dto.PixMerchantDTO;
import com.fag.domain.entities.PixMerchantBO;

public class PixMerchantMapper {

  public static PixMerchantBO toBO(PixMerchantDTO dto) {
    return new PixMerchantBO(dto.getPostalCode(), dto.getCity(), dto.getCategoryCode(), dto.getName());
  }

  public static PixMerchantDTO toDTO(PixMerchantBO bo) {
    PixMerchantDTO dto = new PixMerchantDTO();

    dto.setPostalCode(bo.getPostalCode());
    dto.setCity(bo.getCity());
    dto.setCategoryCode(bo.getCategoryCode());
    dto.setName(bo.getName());

    return dto;
  }
}