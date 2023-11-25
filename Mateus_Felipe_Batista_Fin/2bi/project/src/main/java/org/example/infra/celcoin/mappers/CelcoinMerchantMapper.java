package org.example.infra.celcoin.mappers;

import org.example.domain.dto.MerchantDTO;
import org.example.infra.celcoin.dto.CelcoinMerchantDTO;
import org.example.infra.celcoin.dto.CelcoinTokenDTO;

public class CelcoinMerchantMapper {
    public static MerchantDTO toAppDTO(CelcoinMerchantDTO vendor) {
        MerchantDTO merchantDTO = new MerchantDTO();

        merchantDTO.setPostalCode(vendor.getPostalCode());
        merchantDTO.setCity(vendor.getCity());
        merchantDTO.setCategory(merchantDTO.getCategory());
        merchantDTO.setName(vendor.getName());

        return merchantDTO;
    }

    public static CelcoinMerchantDTO toVendorDTO(MerchantDTO appDTO) {
        CelcoinMerchantDTO celcoinMerchantDTO = new CelcoinMerchantDTO();

        celcoinMerchantDTO.setMerchantCategoryCode(appDTO.getCategory());
        celcoinMerchantDTO.setCity(appDTO.getCity());
        celcoinMerchantDTO.setPostalCode(appDTO.getPostalCode());
        celcoinMerchantDTO.setName(appDTO.getName());

        return celcoinMerchantDTO;
    }
}
