package main.java.com.fag.infra.celcoin.mappers;

import main.java.com.fag.domain.dto.PhoneDTO;
import main.java.com.fag.infra.celcoin.dto.CelcoinPhoneDTO;

public class CelcoinRechargePhoneMapper {
    public static PhoneDto toAppDTO(CelcoinPhonDTO vendorDTO){
        PhoneDTO appDTO = new PhoneDTO();

        appDTO.setStateCode(vendorDTO.getStateCode());
        appDTO.setCountryCode(vendorDTO.getCountryCode());
        appDTO.setNumber(vendortDTO.getNumber());

        return appDTO;
    }

    public static CelcoinPhoneDTO toVendorDTO(PhoneDTO appDTO){
        CelcoinPhoneDTO vendorDTO = new CelcoinPhoneDTO();

        vendorDTO.setStateCode(appDTO.getStateCode());
        vendorDTO.setCountryCode(appDTO.getCountryCode());
        vendorDTO.setNumber(appDTO.getNumber());

        return vendorDTO;
    }
}
