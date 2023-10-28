package br.com.fag.infra.celcoin.mappers;

import br.com.fag.domain.dto.PhoneDTO;
import br.com.fag.infra.celcoin.dto.CelcoinPhoneDTO;

public class CelcoinRechargePhoneMapper {
  public static PhoneDTO toAppDTO(CelcoinPhoneDTO vendorDTO) {
    return new PhoneDTO(vendorDTO.getStateCode(), vendorDTO.getCountryCode(), vendorDTO.getNumber());
  }

  public static CelcoinPhoneDTO toVendorDTO(PhoneDTO appDTO) {
    return new CelcoinPhoneDTO(appDTO.getStateCode(), appDTO.getCountryCode(), appDTO.getNumber());
  }
}
