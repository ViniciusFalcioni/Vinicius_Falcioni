package com.fag.domain.dto;


public class PixCelcoinDTO {
    
    private String id;
    private String key;
    private Double amount;
    private String QRCode;
    private PixMerchantDTO merchant;
    private Long transactionId;
    
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
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
    public String getQRCode() {
        return this.QRCode;
    }
    public void setQrCode(String qrCode) {
        this.QRCode = qrCode;
    }
    public PixMerchantDTO getMerchant() {
        return this.merchant;
    }
    public void setMerchant(PixMerchantDTO merchant) {
        this.merchant = merchant;
    }
    public Long getTransactionId() {
        return this.transactionId;
    }
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
}
