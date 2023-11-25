package com.gabriel.repositories;

public class IQRCodeRepositoryResponse {
  private String response;
  private Long transactionId;
  public String getResponse() {
    return response;
  }
  public void setResponse(String resposne) {
    this.response = resposne;
  }
  public Long getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }
  public IQRCodeRepositoryResponse(String response, Long transactionId) {
    this.response = response;
    this.transactionId = transactionId;
  }
  
}
