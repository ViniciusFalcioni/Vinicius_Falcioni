package br.com.fag.domain.mappers;

import br.com.fag.domain.dto.PhoneDTO;
import br.com.fag.domain.entities.PhoneBO;

public class PhoneMapper {
  public static PhoneDTO toDTO(PhoneBO param) {
    PhoneDTO phone = new PhoneDTO();

    phone.setCountryCode(param.getCountryCode());
    phone.setStateCode(param.getStateCode());
    phone.setNumber(param.getNumber());

    return phone;
  }

  public static PhoneBO toBO(PhoneDTO param) {
    return new PhoneBO(param.getStateCode(), param.getCountryCode(), param.getNumber());
  }
}
