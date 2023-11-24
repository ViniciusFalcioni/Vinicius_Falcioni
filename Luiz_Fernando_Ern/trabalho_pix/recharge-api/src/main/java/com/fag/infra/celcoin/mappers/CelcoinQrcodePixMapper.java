package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.QrcodePixDTO;
import com.fag.infra.celcoin.dto.CelcoinQrcodePixRequestDTO;

public class CelcoinQrcodePixMapper {

    public static CelcoinQrcodePixRequestDTO toVendorDTO(QrcodePixDTO appDTO) {
        CelcoinQrcodePixRequestDTO dto = new CelcoinQrcodePixRequestDTO();

        dto.setKey(appDTO.getKey());
        dto.setAmount(appDTO.getAmount());
        dto.setMerchant(CelcoinMerchantMapper.toVendorDTO(appDTO.getMerchant()));
        dto.setAdditionalInformation(appDTO.getAdditionalInformation());

        return dto;
    }

    public static QrcodePixDTO toAppDTO(CelcoinQrcodePixRequestDTO vendorDTO) {
        QrcodePixDTO dto = new QrcodePixDTO();
        dto.setKey(vendorDTO.getKey());
        dto.setAmount(vendorDTO.getAmount());
        dto.setMerchant(CelcoinMerchantMapper.toAppDTO(vendorDTO.getMerchant()));
        dto.setAdditionalInformation(vendorDTO.getAdditionalInformation());

        return dto;
    }
}