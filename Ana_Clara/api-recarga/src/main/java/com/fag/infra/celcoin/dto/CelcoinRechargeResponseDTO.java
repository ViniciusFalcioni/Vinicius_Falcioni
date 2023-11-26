package com.fag.infra.celcoin.dto;

public class CelcoinRechargeResponseDTO {

  private Integer nsuNameProvider;
  private Integer authentication;
  private CelcoinRechargeReceiptDTO receipt;
  private String settleDate;
  private String createDate;
  private Long transactionId;
  private String urlreceipt;
  private String errorCode;
  private String message;
  private Integer status;

  public Integer getNsuNameProvider() {
    return this.nsuNameProvider;
  }

  public void setNsuNameProvider(Integer nsuNameProvider) {
    this.nsuNameProvider = nsuNameProvider;
  }

  public Integer getAuthentication() {
    return this.authentication;
  }

  public void setAuthentication(Integer authentication) {
    this.authentication = authentication;
  }

  public CelcoinRechargeReceiptDTO getReceipt() {
    return this.receipt;
  }

  public void setReceipt(CelcoinRechargeReceiptDTO receipt) {
    this.receipt = receipt;
  }

  public String getSettleDate() {
    return this.settleDate;
  }

  public void setSettleDate(String settleDate) {
    this.settleDate = settleDate;
  }

  public String getCreateDate() {
    return this.createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public Long getTransactionId() {
    return this.transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public String getUrlreceipt() {
    return this.urlreceipt;
  }

  public void setUrlreceipt(String urlreceipt) {
    this.urlreceipt = urlreceipt;
  }

  public String getErrorCode() {
    return this.errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Integer getStatus() {
    return this.status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


}
