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

    

    /**
     * @return Integer return the nsuNameProvider
     */
    public Integer getNsuNameProvider() {
        return nsuNameProvider;
    }

    /**
     * @param nsuNameProvider the nsuNameProvider to set
     */
    public void setNsuNameProvider(Integer nsuNameProvider) {
        this.nsuNameProvider = nsuNameProvider;
    }

    /**
     * @return Integer return the authentication
     */
    public Integer getAuthentication() {
        return authentication;
    }

    /**
     * @param authentication the authentication to set
     */
    public void setAuthentication(Integer authentication) {
        this.authentication = authentication;
    }

    /**
     * @return CelcoinRechargeReceiptDTO return the receipt
     */
    public CelcoinRechargeReceiptDTO getReceipt() {
        return receipt;
    }

    /**
     * @param receipt the receipt to set
     */
    public void setReceipt(CelcoinRechargeReceiptDTO receipt) {
        this.receipt = receipt;
    }

    /**
     * @return String return the settleDate
     */
    public String getSettleDate() {
        return settleDate;
    }

    /**
     * @param settleDate the settleDate to set
     */
    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    /**
     * @return String return the createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * @return Long return the transactionId
     */
    public Long getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId the transactionId to set
     */
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return String return the urlreceipt
     */
    public String getUrlreceipt() {
        return urlreceipt;
    }

    /**
     * @param urlreceipt the urlreceipt to set
     */
    public void setUrlreceipt(String urlreceipt) {
        this.urlreceipt = urlreceipt;
    }

    /**
     * @return String return the errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return Integer return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}
