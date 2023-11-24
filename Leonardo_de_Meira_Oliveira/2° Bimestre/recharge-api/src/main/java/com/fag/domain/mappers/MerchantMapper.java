package com.fag.domain.mappers;

import com.fag.domain.dto.MerchantDTO;
import com.fag.domain.entities.MerchantBO;

public class MerchantMapper {

    public static MerchantBO toBO(MerchantDTO dto) {
        return new MerchantBO(
                dto.name(),
                dto.postalCode(),
                dto.city(),
                dto.category()
        );
    }

    public static MerchantDTO toDTO(MerchantBO bo) {
        return new MerchantDTO(
                bo.name(),
                bo.postalCode(),
                bo.city(),
                bo.category()
        );
    }

}