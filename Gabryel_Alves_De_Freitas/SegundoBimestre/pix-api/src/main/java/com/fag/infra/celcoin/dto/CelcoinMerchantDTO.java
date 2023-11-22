package com.fag.infra.celcoin.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinMerchantDTO {
  private String postalCode;
  private String city;
  private String merchantCategoryCode;
  private String name;
}