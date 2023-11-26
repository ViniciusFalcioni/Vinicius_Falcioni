package com.gabriel.repositories.celcoin;

public class CelcoinMerchant {
  private String postalCode;
  private String city;
  private int merchantCategoryCode;
  private String name;

  public CelcoinMerchant(String postalCode, String city, int merchantCategoryCode, String name) {
    this.postalCode = postalCode;
    this.city = city;
    this.merchantCategoryCode = merchantCategoryCode;
    this.name = name;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setMerchantCategoryCode(int merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public String getCity() {
    return city;
  }

  public int getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public String getName() {
    return name;
  }
}