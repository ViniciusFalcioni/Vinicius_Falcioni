package com.fag.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MerchantBO {
  private String postalCode;
  private String city;
  private String merchantCategoryCode;
  private String name;
}
