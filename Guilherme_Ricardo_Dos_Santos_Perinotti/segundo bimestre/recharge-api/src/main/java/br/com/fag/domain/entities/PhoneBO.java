package br.com.fag.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PhoneBO {

  private Integer stateCode;
  private Integer countryCode;
  private String number;

}
