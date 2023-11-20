package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.MerchantDTO;
import com.fag.infra.celcoin.dto.CelcoinMerchantDTO;

public class CelcoinMerchantMapper {
    public static MerchantDTO toAppDTO(CelcoinMerchantDTO vendor){
        MerchantDTO dto = new MerchantDTO();

        dto.setCity(vendor.getCity());
        dto.setPostalCode(vendor.getPostalCode());
        dto.setMerchantCategoryCode(vendor.isMerchantCategoryCode());
        dto.setName(vendor.getName());

        return dto;
    }

    public static CelcoinMerchantDTO toVendoDTO(MerchantDTO appDTO){
        CelcoinMerchantDTO dto = new CelcoinMerchantDTO();

        dto.setCity(appDTO.getCity());
        dto.setPostalCode(appDTO.getPostalCode());
        dto.setMerchantCategoryCode(appDTO.getMerchantCategoryCode());
        dto.setName(appDTO.getName());

        return dto;
    }


}
