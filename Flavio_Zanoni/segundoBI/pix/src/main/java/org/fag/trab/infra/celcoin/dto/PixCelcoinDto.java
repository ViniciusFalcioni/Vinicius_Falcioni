package org.fag.trab.infra.celcoin.dto;


import java.math.BigDecimal;

public class PixCelcoinDto {
    private String key;
    private String transactionIdentification;
    private String additionalInformation;
    private MerchantCelcoinDto merchant;
    private BigDecimal amount;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

    public void setTransactionIdentification(String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public MerchantCelcoinDto getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantCelcoinDto merchant) {
        this.merchant = merchant;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
