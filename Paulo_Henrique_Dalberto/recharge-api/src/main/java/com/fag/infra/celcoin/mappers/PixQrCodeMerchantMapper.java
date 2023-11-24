package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.PixMerchantDTO;
import com.fag.infra.celcoin.dto.pix.PixQrCodeMerchantDTO;

public class PixQrCodeMerchantMapper {

    public static PixQrCodeMerchantDTO toVendorDTO(PixMerchantDTO appDTO) {
        PixQrCodeMerchantDTO dto = new PixQrCodeMerchantDTO();

        dto.setPostalCode(appDTO.getPostalCode());
        dto.setCity(appDTO.getCity());
        dto.setMerchantCategoryCode(appDTO.getCategoryCode());
        dto.setName(appDTO.getName());

        return dto;
    }

    public static PixMerchantDTO toAppDTO(PixQrCodeMerchantDTO vendorDTO) {
        PixMerchantDTO dto = new PixMerchantDTO();

        dto.setPostalCode(vendorDTO.getPostalCode());
        dto.setCity(vendorDTO.getCity());
        dto.setCategoryCode(vendorDTO.getMerchantCategoryCode());
        dto.setName(vendorDTO.getName());

        return dto;
    }
}
