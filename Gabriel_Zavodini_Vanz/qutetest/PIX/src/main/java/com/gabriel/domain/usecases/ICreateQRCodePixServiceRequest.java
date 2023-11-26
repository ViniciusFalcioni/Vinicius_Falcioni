package com.gabriel.domain.usecases;

public class ICreateQRCodePixServiceRequest {
  private String key;
  private Double amount;
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }
  public ICreateQRCodePixServiceRequest(String key, Double amount) {
    this.key = key;
    this.amount = amount;
  }
  
}
