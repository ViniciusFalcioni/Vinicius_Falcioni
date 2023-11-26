package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.infra.celcoin.dto.CelcoinPhoneDTO;

public class CelcoinRechargePhoneMapper {

    public static PhoneDTO toAppDTO(CelcoinPhoneDTO vendor) {
        return new PhoneDTO(vendor.getStateCode(), vendor.getCountryCode(), vendor.getNumber());
    }

    public static CelcoinPhoneDTO toVendorDTO(PhoneDTO appDTO) {
        CelcoinPhoneDTO phone = new CelcoinPhoneDTO();

        phone.setStateCode(appDTO.stateCode());
        phone.setCountryCode(appDTO.countryCode());
        phone.setNumber(appDTO.number());

        return phone;
    }

}
