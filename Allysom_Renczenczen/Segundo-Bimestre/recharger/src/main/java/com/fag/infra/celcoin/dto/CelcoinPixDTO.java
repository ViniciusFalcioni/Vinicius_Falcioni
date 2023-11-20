package com.fag.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinPixDTO {

    private String key;
    private Double amount;
    private CelcoinMerchantDTO merchantDTO;
    @JsonbProperty(value = "transactionIdentification")
    private String transactionId;

    public String getKey() {
        return key;
    }

    public Double getAmount() {
        return amount;
    }

    public CelcoinMerchantDTO getMerchantDTO() {
        return merchantDTO;
    }

    public String getTransactionId() {
        return transactionId;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setMerchantDTO(CelcoinMerchantDTO merchantDTO) {
        this.merchantDTO = merchantDTO;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
