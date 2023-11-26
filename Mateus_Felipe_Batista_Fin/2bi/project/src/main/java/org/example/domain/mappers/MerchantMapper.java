package org.example.domain.mappers;

import org.example.domain.dto.MerchantDTO;
import org.example.domain.entities.MerchantBO;

public class MerchantMapper {

    static MerchantDTO toDTO (MerchantBO merchantBO) {

        MerchantDTO merchantDTO = new MerchantDTO();

        merchantDTO.setName(merchantBO.getName());
        merchantDTO.setCategory(merchantBO.getCategory());
        merchantDTO.setCity(merchantBO.getCity());
        merchantDTO.setPostalCode(merchantBO.getPostalCode());

        return merchantDTO;
    }

    static MerchantBO toBO (MerchantDTO merchantDTO) {
        return new MerchantBO(merchantDTO.getName(), merchantDTO.getPostalCode(), merchantDTO.getCity(), merchantDTO.getCategory());
    }
}
