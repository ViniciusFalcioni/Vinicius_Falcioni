package br.com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneDTO {

  private Integer stateCode;
  private Integer countryCode;
  private String number;

}
