package br.com.fag.domain.dto;

public class ProductDTO {
  private Integer code;
  private Integer cost;
  private String name;
  private Double value;
  private Integer due;

  public ProductDTO() {
  }

  public ProductDTO(Integer code, Integer cost, String name, Double value, Integer due) {
    this.code = code;
    this.cost = cost;
    this.name = name;
    this.value = value;
    this.due = due;
  }

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

  public Integer getDue() {
    return this.due;
  }

  public void setDue(Integer due) {
    this.due = due;
  }
}
