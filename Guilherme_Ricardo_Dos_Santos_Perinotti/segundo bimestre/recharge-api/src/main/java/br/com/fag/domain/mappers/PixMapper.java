package br.com.fag.domain.mappers;

import br.com.fag.domain.dto.PixDTO;
import br.com.fag.domain.entities.PixBO;

public class PixMapper {

  public static PixBO toBO(PixDTO dto) {
    return new PixBO(dto.getKey(), dto.getAmount(), MerchantMapper.toBO(dto.getMerchant()));
  }

  public static PixDTO toDTO(PixBO bo) {
    PixDTO dto = new PixDTO();

    dto.setKey(bo.getKey());
    dto.setAmount(bo.getAmount());
    dto.setMerchant(MerchantMapper.toDTO(bo.getMerchant()));

    return dto;
  }

}
