package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.MerchantDTO;
import com.fag.infra.celcoin.dto.CelcoinMerchantDTO;

public class CelcoinMerchantMapper {

    public static MerchantDTO toAppDTO(CelcoinMerchantDTO vendor) {
        return new MerchantDTO(
                vendor.name(),
                vendor.postalCode(),
                vendor.city(),
                vendor.merchantCategoryCode()
        );
    }

    public static CelcoinMerchantDTO toVendorDTO(MerchantDTO appDTO) {
        return new CelcoinMerchantDTO(
                appDTO.name(),
                appDTO.postalCode(),
                appDTO.city(),
                appDTO.category()
        );
    }

}