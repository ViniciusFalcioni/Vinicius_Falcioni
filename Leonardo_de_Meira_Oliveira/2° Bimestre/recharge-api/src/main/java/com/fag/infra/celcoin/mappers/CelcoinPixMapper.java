package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.PixDTO;
import com.fag.infra.celcoin.dto.CelcoinPixDTO;

import java.math.RoundingMode;

public class CelcoinPixMapper {

    public static PixDTO toAppDTO(CelcoinPixDTO vendor) {
        return new PixDTO(
                null,
                vendor.getKey(),
                vendor.getAmount(),
                null,
                CelcoinMerchantMapper.toAppDTO(vendor.getMerchant()),
                Long.valueOf(vendor.getTransactionId())
        );
    }

    public static CelcoinPixDTO toVendorDTO(PixDTO appDTO) {
        CelcoinPixDTO dto = new CelcoinPixDTO();

        dto.setKey(appDTO.key());

        // É necessário informar 2 casas decimais, caso contrário é retornada
        // uma exception a partir da API da Celcoin
        dto.setAmount(appDTO.amount().setScale(2, RoundingMode.HALF_UP));
        dto.setMerchant(CelcoinMerchantMapper.toVendorDTO(appDTO.merchant()));

        return dto;
    }

}