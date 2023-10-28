package com.fag.Infra.Celcoin.Mappers;

import com.fag.Domain.DTO.PhoneDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinPhoneDTO;

public class CelcoinRechargePhoneMapper {
    public static PhoneDTO toAppDTO(CelcoinPhoneDTO vendorDTO) {
        PhoneDTO appDTO = new PhoneDTO();

        appDTO.setStateCode(vendorDTO.getStateCode());
        appDTO.setCountryCode(vendorDTO.getCountryCode());
        appDTO.setNumber(vendorDTO.getNumber());

        return appDTO;
    }

    public static CelcoinPhoneDTO toVendorDTO(PhoneDTO appDTO) {
        CelcoinPhoneDTO vendorDTO = new CelcoinPhoneDTO();

        vendorDTO.setStateCode(appDTO.getStateCode());
        vendorDTO.setCountryCode(appDTO.getCountryCode());
        vendorDTO.setNumber(appDTO.getNumber());

        return vendorDTO;
    }
}
