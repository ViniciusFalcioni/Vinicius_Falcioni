package br.com.fag.infra.celcoin.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinProductDTO {

  private Integer code;
  private Integer cost;
  private Integer dueProduct;
  private String productName;
  private Double minValue;

}
