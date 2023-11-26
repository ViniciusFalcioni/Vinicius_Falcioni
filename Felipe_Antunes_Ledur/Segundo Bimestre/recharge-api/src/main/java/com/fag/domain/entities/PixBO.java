package com.fag.domain.entities;

import java.util.UUID;

public class PixBO {
  private UUID id;
  private String key;
  private Double amount;
  private String qrCode;
  private Long transactionId;

  public PixBO(UUID id, String key, Double amount, String qrCode, Long transactionId) {
    this.id = id != null ? id : UUID.randomUUID();
    this.key = key;
    this.amount = amount;
    this.qrCode = qrCode;
    this.transactionId = transactionId;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
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

  public Long getTransactionId() {
    return this.transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }


}
