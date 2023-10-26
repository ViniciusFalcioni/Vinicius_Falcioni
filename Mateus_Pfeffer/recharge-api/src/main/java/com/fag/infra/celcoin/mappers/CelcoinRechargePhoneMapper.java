package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.infra.celcoin.dto.CelcoinPhoneDTO;

public class CelcoinRechargePhoneMapper {

    public static PhoneDTO toAppDTO(CelcoinPhoneDTO vendor) {
        return new PhoneDTO(vendor.stateCode(), vendor.countryCode(), vendor.number());
    }

    public static CelcoinPhoneDTO toVendorDTO(PhoneDTO appDTO) {
        return new CelcoinPhoneDTO(appDTO.stateCode(), appDTO.countryCode(), appDTO.number());
    }

}
