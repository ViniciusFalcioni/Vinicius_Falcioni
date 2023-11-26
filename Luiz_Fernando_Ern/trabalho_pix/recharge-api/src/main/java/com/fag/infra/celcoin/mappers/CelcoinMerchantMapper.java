package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.MerchantDTO;
import com.fag.infra.celcoin.dto.CelcoinMerchantDTO;

public class CelcoinMerchantMapper {

    public static CelcoinMerchantDTO toVendorDTO(MerchantDTO appDTO) {
        CelcoinMerchantDTO dto = new CelcoinMerchantDTO();

        dto.setPostalCode(appDTO.getPostalCode());
        dto.setCity(appDTO.getCity());
        dto.setName(appDTO.getName());
        dto.setMerchantCategoryCode(appDTO.getCategoryCode());

        return dto;
    }

    public static MerchantDTO toAppDTO(CelcoinMerchantDTO vendorDTO) {
        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(vendorDTO.getPostalCode());
        dto.setCity(vendorDTO.getCity());
        dto.setName(vendorDTO.getName());
        dto.setCategoryCode(vendorDTO.getMerchantCategoryCode());

        return dto;
    }
}
