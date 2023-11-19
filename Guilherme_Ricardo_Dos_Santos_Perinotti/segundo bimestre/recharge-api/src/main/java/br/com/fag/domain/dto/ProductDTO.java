package br.com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

  private Integer code;
  private Integer cost;
  private Integer dueProduct;
  private String name;
  private Double value;

}
