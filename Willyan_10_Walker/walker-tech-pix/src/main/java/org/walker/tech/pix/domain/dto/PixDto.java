package org.walker.tech.pix.domain.dto;

import java.math.BigDecimal;

public class PixDto {
    private String id;
    private String transactionIdentification;
    private String qrCode;
    private String key;
    private MerchantDto merchant;
    private String description;
    private BigDecimal amount;

    public PixDto(String id, String transactionIdentification, String qrCode, String key, MerchantDto merchant, String description, BigDecimal amount) {
        this.id = id;
        this.transactionIdentification = transactionIdentification;
        this.qrCode = qrCode;
        this.key = key;
        this.merchant = merchant;
        this.description = description;
        this.amount = amount;
    }

    public PixDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

    public void setTransactionIdentification(String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public MerchantDto getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantDto merchant) {
        this.merchant = merchant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
