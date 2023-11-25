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
    
    public void setNsuNameProvider(Integer nsuNameProvider) {
        this.nsuNameProvider = nsuNameProvider;
    }
    public void setAuthentication(Integer authentication) {
        this.authentication = authentication;
    }
    public void setReceipt(CelcoinRechargeReceiptDTO receipt) {
        this.receipt = receipt;
    }
    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
    public void setUrlreceipt(String urlreceipt) {
        this.urlreceipt = urlreceipt;
    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public Integer getNsuNameProvider() {
        return nsuNameProvider;
    }
    public Integer getAuthentication() {
        return authentication;
    }
    public CelcoinRechargeReceiptDTO getReceipt() {
        return receipt;
    }
    public String getSettleDate() {
        return settleDate;
    }
    public String getCreateDate() {
        return createDate;
    }
    public Long getTransactionId() {
        return transactionId;
    }
    public String getUrlreceipt() {
        return urlreceipt;
    }
    public String getErrorCode() {
        return errorCode;
    }
    public String getMessage() {
        return message;
    }
    public Integer getStatus() {
        return status;
    }
    
}
