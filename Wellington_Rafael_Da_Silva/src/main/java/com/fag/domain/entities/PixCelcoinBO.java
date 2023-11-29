package com.fag.domain.entities;

import java.util.UUID;

public class PixCelcoinBO {
    private UUID id;
    private String key;
    private Double amount;
    private String QRCode;
    private Long transactionId;

    public PixCelcoinBO(UUID id, String key, Double amount, String QRCode, Long transactionId) {
        this.id = id != null ? id : UUID.randomUUID();
        this.key = key;
        this.amount = amount;
        this.QRCode = QRCode;
        this.transactionId = transactionId;
    }
    public UUID getId() {
        return this.id;
    }
    public void setId(UUID id) {
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
    public String getQrCode() {
        return this.QRCode;
    }
    public void setQrCode(String QRCode) {
        this.QRCode = QRCode;
    }
    public Long getTransactionId() {
        return this.transactionId;
    }
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
}
