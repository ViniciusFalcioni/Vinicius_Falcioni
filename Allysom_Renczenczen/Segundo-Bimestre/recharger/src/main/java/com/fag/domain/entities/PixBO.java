package com.fag.domain.entities;

import com.fag.domain.dto.MerchantDTO;

import java.time.LocalDateTime;
import java.util.UUID;


public class PixBO {
    private UUID id;
    private String key;
    private Double amount;
    private String qrCode;
    private Long transactionId;
    private MerchantDTO merchant;

    public PixBO(String id, String key, Double amount, String qrCode, Long transactionId, MerchantDTO merchant){
        this.id = id != null ? UUID.fromString(id) : UUID.randomUUID();
        this.key = key;
        this.amount = amount;
        this.qrCode = qrCode;
        this.transactionId = transactionId;
        this.merchant = merchant;

        validate();
    }

    public PixBO(UUID id, String key, Double amount, String emvqrcps, Long transactionId) {
    }

    public void validate(){

    }

    public UUID getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public Double getAmount() {
        return amount;
    }

    public String getQrCode() {
        return qrCode;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public MerchantDTO getMerchant() {
        return merchant;
    }
}
