package com.fag.domain.mappers;

import com.fag.domain.dto.PixMerchantDTO;
import com.fag.domain.entities.MerchantBO;

public class MerchantMapper {
    public static MerchantBO toBO(PixMerchantDTO dto) {
        return new MerchantBO(dto.getPostalCode(), dto.getCity(), dto.getCategoryCode(), dto.getName());
    }
    public static PixMerchantDTO toDTO(MerchantBO bo) {
        PixMerchantDTO dto = new PixMerchantDTO();
        dto.setPostalCode(bo.getPostalCode());
        dto.setCity(bo.getCity());
        dto.setCategoryCode(bo.getCategoryCode());
        dto.setName(bo.getName());
        return dto;
    }
}
