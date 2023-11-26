package com.fag.domain.dto;

import jakarta.json.bind.annotation.JsonbTransient;

public class PixQrCodeDTO {
  private String id;
  private String key;
  private Double amount;
  private String qrCode;
  private PixMerchantDTO merchant;
  private Long transactionId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @JsonbTransient
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

  public String getQrCode() {
    return qrCode;
  }

  public void setQrCode(String qrCode) {
    this.qrCode = qrCode;
  }

  @JsonbTransient
  public PixMerchantDTO getMerchant() {
    return merchant;
  }

  public void setMerchant(PixMerchantDTO merchant) {
    this.merchant = merchant;
  }

  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }
}
