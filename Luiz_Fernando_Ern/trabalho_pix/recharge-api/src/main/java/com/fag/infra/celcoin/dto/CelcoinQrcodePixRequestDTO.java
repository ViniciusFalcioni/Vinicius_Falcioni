package com.fag.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinQrcodePixRequestDTO {
  private String key;
  private Double amount;
  private CelcoinMerchantDTO merchant;
  private String transictionId;
  private String additionalInformation;

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

  public CelcoinMerchantDTO getMerchant() {
    return merchant;
  }

  public void setMerchant(CelcoinMerchantDTO merchant) {
    this.merchant = merchant;
  }

  @JsonbProperty(value = "transictionId")
  public String getTransictionId() {
    return transictionId;
  }

  @JsonbProperty(value = "transictionId")
  public void setTransictionId(String transictionId) {
    this.transictionId = transictionId;
  }

  @JsonbProperty(value = " additionalInformation")
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  @JsonbProperty(value = " additionalInformation")
  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }
}