package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.PixDTO;

import com.fag.infra.celcoin.dto.CelcoinPixDTO;

public class CelcoinPixMapper {
    public static PixDTO toAppDTO(CelcoinPixDTO vendor){
        PixDTO dto = new PixDTO();
        dto.setKey(vendor.getKey());
        dto.setAmount(vendor.getAmount());
        dto.setMerchant(CelcoinMerchantMapper.toAppDTO(vendor.getMerchantDTO()));
        return dto;
    }

    public  static CelcoinPixDTO toVendoDTO(PixDTO appDTO){
        CelcoinPixDTO dto = new CelcoinPixDTO();

        dto.setAmount(appDTO.getAmount());
        dto.setKey(appDTO.getKey());
        dto.setMerchantDTO(CelcoinMerchantMapper.toVendoDTO(appDTO.getMerchant()));

        return dto;
    }
}
