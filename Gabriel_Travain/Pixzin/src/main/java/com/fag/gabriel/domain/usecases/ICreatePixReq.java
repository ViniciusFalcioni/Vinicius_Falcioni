package com.fag.gabriel.domain.usecases;

public class ICreatePixReq {
  private String pixKey;
  private Double pixAmount;
  public String getPixKey() {
    return pixKey;
  }
  public void setPixKey(String pixKey) {
    this.pixKey = pixKey;
  }
  public Double getPixAmount() {
    return pixAmount;
  }
  public void setPixAmount(Double pixAmount) {
    this.pixAmount = pixAmount;
  }
  public ICreatePixReq(String pixKey, Double pixAmount) {
    this.pixKey = pixKey;
    this.pixAmount = pixAmount;
  }
}
