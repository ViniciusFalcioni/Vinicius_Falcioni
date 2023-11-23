package br.com.fag.domain.dto;

public class OperatorDTO {
  private Integer category;
  private String name;
  private Integer providerId;
  private Double maxValue;
  private Double minValue;

  public OperatorDTO() {
  }

  public Integer getCategory() {
    return this.category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getProviderId() {
    return this.providerId;
  }

  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }

  public Double getMaxValue() {
    return this.maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  public Double getMinValue() {
    return this.minValue;
  }

  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }
}
