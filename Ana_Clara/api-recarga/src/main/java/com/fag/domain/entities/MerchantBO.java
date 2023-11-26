package com.fag.domain.entities;

public class MerchantBO {
  private String postalCode;
  private String city;
  private Integer categoryCode;
  private String name;

  public MerchantBO(String postalCode, String city, Integer categoryCode, String name) {
    this.postalCode = postalCode;
    this.city = city;
    this.categoryCode = categoryCode;
    this.name = name;
  }

  public String getPostalCode() {
    return this.postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Integer getCategoryCode() {
    return this.categoryCode;
  }

  public void setCategoryCode(Integer categoryCode) {
    this.categoryCode = categoryCode;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
