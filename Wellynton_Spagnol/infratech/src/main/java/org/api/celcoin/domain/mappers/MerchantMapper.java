package org.api.celcoin.domain.mappers;

import org.api.celcoin.domain.dto.MerchantDTO;
import org.api.celcoin.domain.entities.MerchantBO;

public class MerchantMapper {
    public static MerchantBO toBO(MerchantDTO dto) {
        return new MerchantBO(dto.getPostalCode(), dto.getCity(), dto.getCategoryCode(), dto.getName());
    }

    public static MerchantDTO toDTO(MerchantBO bo) {
        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(bo.getPostalCode());
        dto.setCity(bo.getCity());
        dto.setCategoryCode(bo.getCategoryCode());
        dto.setName(bo.getName());

        return dto;
    }
}
