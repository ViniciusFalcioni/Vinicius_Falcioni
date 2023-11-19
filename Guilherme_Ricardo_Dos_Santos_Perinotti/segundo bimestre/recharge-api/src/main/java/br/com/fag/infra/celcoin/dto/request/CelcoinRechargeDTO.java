package br.com.fag.infra.celcoin.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinRechargeDTO {

  private String cpfCnpj;
  private Integer providerId;
  private CelcoinPhoneDTO phone;
  private CelcoinRechargeValueDTO topupData;
  
}
