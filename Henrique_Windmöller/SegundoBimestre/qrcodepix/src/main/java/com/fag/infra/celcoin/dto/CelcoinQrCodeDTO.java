package com.fag.infra.celcoin.dto;

public class CelcoinQrCodeDTO {
    
    private String key;
    private Double amount;
    private String transactionIdentification;
    
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getTransactionIdentification() {
        return transactionIdentification;
    }
    public void setTransactionIdentification(String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }

    
}
