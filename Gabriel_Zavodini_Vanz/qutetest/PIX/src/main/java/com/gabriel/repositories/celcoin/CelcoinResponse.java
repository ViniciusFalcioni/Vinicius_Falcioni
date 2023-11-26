package com.gabriel.repositories.celcoin;


public class CelcoinResponse {
  private Long transactionId;

  private String emvqrcps;

  private String transactionIdentification;

  public Long getTransactionId() {
      return transactionId;
  }

  public String getEmvqrcps() {
      return emvqrcps;
  }

  public String getTransactionIdentification() {
      return transactionIdentification;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public void setEmvqrcps(String emvqrcps) {
    this.emvqrcps = emvqrcps;
  }

  public void setTransactionIdentification(String transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
  }

  
}
