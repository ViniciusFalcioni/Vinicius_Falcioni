package org.apicellcoin.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinPixResponseDTO {
  private Long transactionId;
  @JsonbProperty(value = "emvqrcps")
  private String QRCode;

  public Long getTransactionId() {
    return this.transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public String getQRCode() {
    return this.QRCode;
  }

  public void setQRCode(String QRCode) {
    this.QRCode = QRCode;
  }

}