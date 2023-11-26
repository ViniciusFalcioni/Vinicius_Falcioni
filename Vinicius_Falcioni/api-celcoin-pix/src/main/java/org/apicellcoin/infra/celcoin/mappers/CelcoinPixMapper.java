package org.apicellcoin.infra.celcoin.mappers;

import org.apicellcoin.domain.dto.PixCelcoinDTO;
import org.apicellcoin.infra.celcoin.dto.CelcoinPixDTO;

public class CelcoinPixMapper {

    public static PixCelcoinDTO toAppDTO(CelcoinPixDTO vendorDTO) {
        PixCelcoinDTO dto = new PixCelcoinDTO();
        dto.setKey(vendorDTO.getKey());
        dto.setAmount(vendorDTO.getAmount());
        dto.setMerchant(CelcoinMerchantMapper.toAppDTO(vendorDTO.getMerchant()));

        return dto;
    }

    public static CelcoinPixDTO toVendorDTO(PixCelcoinDTO appDTO) {
        CelcoinPixDTO dto = new CelcoinPixDTO();

        dto.setKey(appDTO.getKey());
        dto.setAmount(appDTO.getAmount());
        dto.setMerchant(CelcoinMerchantMapper.toVendorDTO(appDTO.getMerchant()));

        return dto;
    }

}