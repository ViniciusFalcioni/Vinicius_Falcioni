package br.com.fag.infra.celcoin.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinPhoneDTO {

  private Integer stateCode;

  private Integer countryCode;

  private String number;

}
