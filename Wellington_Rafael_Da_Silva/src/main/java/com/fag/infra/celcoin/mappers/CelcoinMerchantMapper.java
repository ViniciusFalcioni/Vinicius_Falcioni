package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.PixMerchantDTO;
import com.fag.infra.celcoin.dto.CelcoinMerchantDTO;

public class CelcoinMerchantMapper {

    public static PixMerchantDTO toAppDTO(CelcoinMerchantDTO vendorDTO) {
        PixMerchantDTO dto = new PixMerchantDTO();
        dto.setPostalCode(vendorDTO.getPostalCode());
        dto.setCity(vendorDTO.getCity());
        dto.setCategoryCode(vendorDTO.getMerchantCategoryCode());
        dto.setName(vendorDTO.getName());
        return dto;
    }
    public static CelcoinMerchantDTO toVendorDTO(PixMerchantDTO appDTO) {
        CelcoinMerchantDTO dto = new CelcoinMerchantDTO();
        dto.setPostalCode(appDTO.getPostalCode());
        dto.setCity(appDTO.getCity());
        dto.setMerchantCategoryCode(appDTO.getCategoryCode());
        dto.setName(appDTO.getName());
        return dto;
    }
}
