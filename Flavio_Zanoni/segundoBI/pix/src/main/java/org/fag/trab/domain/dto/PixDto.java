package org.fag.trab.domain.dto;

import java.math.BigDecimal;

public class PixDto {
    private String id;
    private String transactionIdentification;
    private String qrCode;
    private String key;
    private MerchantDto merchant;
    private String description;
    private BigDecimal amount;

    public PixDto(String id, String transactionIdentification, String qrCode, String key, String description, BigDecimal amount) {
        this.id = id;
        this.transactionIdentification = transactionIdentification;
        this.qrCode = qrCode;
        this.key = key;
        this.description = description;
        this.amount = amount;
    }

    public PixDto() {
    }

    public MerchantDto getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantDto merchant) {
        this.merchant = merchant;
    }

    public String getId() {
        return this.id;
    }

    public String getTransactionIdentification() {
        return this.transactionIdentification;
    }

    public String getQrCode() {
        return this.qrCode;
    }

    public String getKey() {
        return this.key;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setTransactionIdentification(final String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }

    public void setQrCode(final String qrCode) {
        this.qrCode = qrCode;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }

}
