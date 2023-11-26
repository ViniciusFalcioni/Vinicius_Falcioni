package br.com.fag.infra.celcoin.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinMerchantDTO {
  private String postalCode;
  private String city;
  private Integer merchantCategoryCode;
  private String name;
}
