package com.github.faening.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinCreateStaticQrCodeRequestDTO {
    private String key;
    private Double amount;
    private String transactionIdentification;
    @JsonbProperty("merchant")
    private CelcoinMerchantDTO celcoinMerchantDTO;

    public CelcoinCreateStaticQrCodeRequestDTO(
        String key,
        Double amount,
        String transactionIdentification,
        CelcoinMerchantDTO celcoinMerchantDTO
    ) {
        this.key = key;
        this.amount = amount;
        this.transactionIdentification = transactionIdentification;
        this.celcoinMerchantDTO = celcoinMerchantDTO;
    }

    public CelcoinCreateStaticQrCodeRequestDTO() {}

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

    public CelcoinMerchantDTO getCelcoinMerchantDTO() {
        return celcoinMerchantDTO;
    }

    public void setCelcoinMerchantDTO(CelcoinMerchantDTO celcoinMerchantDTO) {
        this.celcoinMerchantDTO = celcoinMerchantDTO;
    }
}
