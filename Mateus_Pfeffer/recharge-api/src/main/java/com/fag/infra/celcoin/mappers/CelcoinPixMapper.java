package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.PixDTO;
import com.fag.infra.celcoin.dto.CelcoinPixDTO;

public class CelcoinPixMapper {

    public static PixDTO toAppDTO(CelcoinPixDTO vendor) {
        return new PixDTO(
                null,
                vendor.key(),
                vendor.amount(),
                null,
                CelcoinMerchantMapper.toAppDTO(vendor.merchant()),
                Long.valueOf(vendor.transactionId())
        );
    }

    public static CelcoinPixDTO toVendorDTO(PixDTO appDTO) {
        return new CelcoinPixDTO(
                appDTO.key(),
                appDTO.amount(),
                CelcoinMerchantMapper.toVendorDTO(appDTO.merchant()),
                String.valueOf(appDTO.transactionId())
        );
    }

}
