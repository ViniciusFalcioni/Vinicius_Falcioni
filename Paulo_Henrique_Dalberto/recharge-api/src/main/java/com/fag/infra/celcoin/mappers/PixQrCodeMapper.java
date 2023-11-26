package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.PixQrCodeDTO;
import com.fag.infra.celcoin.dto.pix.PixQrCodeRequestDTO;

public class PixQrCodeMapper {

    public static PixQrCodeRequestDTO toVendorDTO(PixQrCodeDTO appDTO) {
        PixQrCodeRequestDTO dto = new PixQrCodeRequestDTO();

        dto.setKey(appDTO.getKey());
        dto.setAmount(appDTO.getAmount());
        dto.setMerchant(PixQrCodeMerchantMapper.toVendorDTO(appDTO.getMerchant()));

        return dto;
    }

    public static PixQrCodeDTO toAppDTO(PixQrCodeRequestDTO vendorDTO) {
        PixQrCodeDTO dto = new PixQrCodeDTO();
        dto.setKey(vendorDTO.getKey());
        dto.setAmount(vendorDTO.getAmount());
        dto.setMerchant(PixQrCodeMerchantMapper.toAppDTO(vendorDTO.getMerchant()));

        return dto;
    }
}
