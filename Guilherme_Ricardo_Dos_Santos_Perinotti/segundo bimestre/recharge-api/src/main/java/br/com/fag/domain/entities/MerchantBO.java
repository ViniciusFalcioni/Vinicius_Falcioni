package br.com.fag.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MerchantBO {
  private String postalCode;
  private String city;
  private Integer categoryCode;
  private String name;
}
