package com.fag.domain.dto;

public class ProductDTO {

  private Integer code;
  private Integer cost;
  private Integer dueProduct;
  private String name;
  private Double value;

  public Integer getCode() {
    return this.code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Integer getCost() {
    return this.cost;
  }

  public void setCost(Integer cost) {
    this.cost = cost;
  }

  public Integer getDueProduct() {
    return this.dueProduct;
  }

  public void setDueProduct(Integer dueProduct) {
    this.dueProduct = dueProduct;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getValue() {
    return this.value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


}
