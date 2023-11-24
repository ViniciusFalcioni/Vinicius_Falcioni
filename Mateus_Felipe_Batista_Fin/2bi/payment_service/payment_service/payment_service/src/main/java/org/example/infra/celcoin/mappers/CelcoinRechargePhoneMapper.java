package main.java.org.example.infra.celcoin.mappers;


import main.java.org.example.domain.dto.PhoneDTO;
import main.java.org.example.infra.celcoin.dto.CelcoinPhoneDTO;

public class CelcoinRechargePhoneMapper {
    public static PhoneDTO toAppDTO (CelcoinPhoneDTO vendorDTO) {
        PhoneDTO appDTO = new PhoneDTO();

        appDTO.setStateCode(vendorDTO.getStateCode());
        appDTO.setNumber(vendorDTO.getNumber());
        appDTO.setCountryCode(vendorDTO.getCountryCode());

        return appDTO;
    }

    public static CelcoinPhoneDTO toVendorDTO (PhoneDTO appDTO) {
        CelcoinPhoneDTO vendorDTO = new CelcoinPhoneDTO();

        vendorDTO.setCountryCode(appDTO.getCountryCode());
        vendorDTO.setNumber(vendorDTO.getNumber());
        vendorDTO.setStateCode(vendorDTO.getStateCode());

        return vendorDTO;
    }
}
