package com.fag.domain.entities;

public class PixMerchantBO {
  private String postalCode;
  private Integer categoryCode;
  private String name;
  private String city;

  public PixMerchantBO(String postalCode, String city, Integer categoryCode, String name) {
    this.postalCode = postalCode;
    this.categoryCode = categoryCode;
    this.name = name;
    this.city = city;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Integer getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(Integer categoryCode) {
    this.categoryCode = categoryCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}