package com.fag.infra.celcoin.dto.pix;

public class PixQrCodeRechargeResponseDTO {
  private Integer nsuNameProvider;
  private Integer authentication;
  private PixQrCodeRechargeReceiptDTO receipt;
  private String settleDate;
  private String createDate;
  private Long transactionId;
  private String urlreceipt;
  private String errorCode;
  private String message;
  private Integer status;

  public Integer getNsuNameProvider() {
    return nsuNameProvider;
  }

  public void setNsuNameProvider(Integer nsuNameProvider) {
    this.nsuNameProvider = nsuNameProvider;
  }

  public Integer getAuthentication() {
    return authentication;
  }

  public void setAuthentication(Integer authentication) {
    this.authentication = authentication;
  }

  public PixQrCodeRechargeReceiptDTO getReceipt() {
    return receipt;
  }

  public void setReceipt(PixQrCodeRechargeReceiptDTO receipt) {
    this.receipt = receipt;
  }

  public String getSettleDate() {
    return settleDate;
  }

  public void setSettleDate(String settleDate) {
    this.settleDate = settleDate;
  }

  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public String getUrlreceipt() {
    return urlreceipt;
  }

  public void setUrlreceipt(String urlreceipt) {
    this.urlreceipt = urlreceipt;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  
}
