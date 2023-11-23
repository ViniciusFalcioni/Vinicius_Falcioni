package br.com.fag.domain.dto;

public class ProductDTO {
  private String name;
  private Double value;
  private Integer due;

  public ProductDTO() {
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
