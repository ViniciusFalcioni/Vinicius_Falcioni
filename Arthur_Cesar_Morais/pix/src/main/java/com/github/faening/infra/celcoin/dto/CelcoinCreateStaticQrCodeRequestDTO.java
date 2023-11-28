package com.github.faening.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinCreateStaticQrCodeRequestDTO {
    @JsonbProperty("merchant")
    private CelcoinMerchantDTO merchant;
    private String key;
    private Double amount;
    private String transactionIdentification;

    public CelcoinCreateStaticQrCodeRequestDTO(CelcoinMerchantDTO merchant, String key, Double amount, String transactionIdentification) {
        this.merchant = merchant;
        this.key = key;
        this.amount = amount;
        this.transactionIdentification = transactionIdentification;
    }

    public CelcoinCreateStaticQrCodeRequestDTO() { }

    public CelcoinMerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(CelcoinMerchantDTO merchant) {
        this.merchant = merchant;
    }

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

