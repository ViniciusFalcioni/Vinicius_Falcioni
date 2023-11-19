package br.com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RechargeDTO {

  private String id;
  private Double value;
  private String document;
  private Integer operatorId;
  private PhoneDTO phone;
  private String receipt;
  private Long transactionId;
  private boolean success;

}
