package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.MerchantDTO;
import com.fag.infra.celcoin.dto.CelcoinMerchantDTO;

public class CelcoinMerchantMapper {

    public static MerchantDTO toAppDTO(CelcoinMerchantDTO vendor) {
        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(vendor.getPostalCode());
        dto.setName(vendor.getName());
        dto.setCategory(vendor.getMerchantCategoryCode());
        dto.setCity(vendor.getCity());

        return dto;
    }

    public static CelcoinMerchantDTO toVendorDTO(MerchantDTO appDTO) {
        CelcoinMerchantDTO dto = new CelcoinMerchantDTO();
        
        dto.setName(appDTO.getName());
        dto.setCity(appDTO.getCity());
        dto.setMerchantCategoryCode(appDTO.getCategory());
        dto.setPostalCode(appDTO.getPostalCode());

        return dto;
    }
}