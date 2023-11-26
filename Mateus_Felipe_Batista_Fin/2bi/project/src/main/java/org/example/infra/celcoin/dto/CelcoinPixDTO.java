package org.example.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

import java.math.BigDecimal;

public class CelcoinPixDTO {
    private String key;
    private BigDecimal amount;
    private CelcoinMerchantDTO merchant;

    @JsonbProperty(value = "transactionIdentification")
    private String transactionId;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CelcoinMerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(CelcoinMerchantDTO merchant) {
        this.merchant = merchant;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
