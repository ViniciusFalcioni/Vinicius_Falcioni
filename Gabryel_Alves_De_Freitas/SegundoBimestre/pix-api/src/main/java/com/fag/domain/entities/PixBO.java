package com.fag.domain.entities;

import java.util.UUID;
import java.math.BigDecimal;

import lombok.Getter;

@Getter
public class PixBO {
  private UUID id;
  private String key;
  private BigDecimal amount;
  private String qrCode;
  private Long transactionId;

  public PixBO(UUID id, String key, BigDecimal amount, String qrCode, Long transactionId) {
    this.id = id != null ? id : UUID.randomUUID();
    this.key = key;
    this.amount = amount;
    this.qrCode = qrCode;
    this.transactionId = transactionId;
  }

}