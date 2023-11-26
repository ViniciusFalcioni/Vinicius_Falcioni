package com.fag.infra.celcoin.dto.pix;

import jakarta.json.bind.annotation.JsonbProperty;

public class PixQrCodeRequestDTO {
  private String key;
  private Double amount;
  private PixQrCodeMerchantDTO merchant;
  private String transictionId;

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

  public PixQrCodeMerchantDTO getMerchant() {
    return merchant;
  }

  public void setMerchant(PixQrCodeMerchantDTO merchant) {
    this.merchant = merchant;
  }

  @JsonbProperty(value = "transictionId")
  public String gettransictionId() {
    return transictionId;
  }

  @JsonbProperty(value = "transictionId")
  public void settransictionId(String transictionId) {
    this.transictionId = transictionId;
  }
}
