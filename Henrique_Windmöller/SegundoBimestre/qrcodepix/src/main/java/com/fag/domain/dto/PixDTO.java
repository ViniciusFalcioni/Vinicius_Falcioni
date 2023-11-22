package com.fag.domain.dto;

public class PixDTO {
    private String id;
    private String key;
    private double amount;
    private String transactionIdentification;
    private MerchantDTO merchant;
    private String qrCode;
    private Long transactionId;
    // Getters
    public String getKey() {
        return key;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

    public MerchantDTO getMerchant() {
        return merchant;
    }

    // Setters
    public void setKey(String key) {
        this.key = key;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTransactionIdentification(String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }

    public void setMerchant(MerchantDTO merchant) {
        this.merchant = merchant;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    
}
