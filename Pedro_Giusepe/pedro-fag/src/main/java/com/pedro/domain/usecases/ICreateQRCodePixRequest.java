package com.pedro.domain.usecases;

public class ICreateQRCodePixRequest {
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
  public ICreateQRCodePixRequest(String key, Double amount) {
    this.key = key;
    this.amount = amount;
  }
  
}
