package com.fag.domain.dto;

public class PixDTO {
  private String id;
  private String key;
  private Double amount;
  private String qrCode;
  private MerchantDTO merchant;
  private Long transactionId;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Double getAmount() {
    return this.amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getQrCode() {
    return this.qrCode;
  }

  public void setQrCode(String qrCode) {
    this.qrCode = qrCode;
  }

  public MerchantDTO getMerchant() {
    return this.merchant;
  }

  public void setMerchant(MerchantDTO merchant) {
    this.merchant = merchant;
  }

  public Long getTransactionId() {
    return this.transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

}
