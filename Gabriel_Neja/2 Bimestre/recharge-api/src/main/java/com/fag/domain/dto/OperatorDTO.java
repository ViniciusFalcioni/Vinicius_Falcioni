package com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OperatorDTO {
   private String name;
   private Double maxValue;
   private Double minValue;
   private Integer category;
   private Integer operatorId;
   private Integer providerId;
   private Integer rechargeType;
   
}