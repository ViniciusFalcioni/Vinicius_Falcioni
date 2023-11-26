package br.com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OperatorDTO {

  private Integer category;
  private Integer rechargeType;
  private String name;
  private Integer providerId;
  private Double maxValue;
  private Double minValue;
  
}
