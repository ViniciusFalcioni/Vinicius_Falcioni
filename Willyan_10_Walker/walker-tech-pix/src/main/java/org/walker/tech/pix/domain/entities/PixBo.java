package org.walker.tech.pix.domain.entities;

import java.math.BigDecimal;

public class PixBo {
    private String id;
    private String qrCode; // Alterei o nome da variável para seguir a convenção camelCase
    private String key;
    private MerchantBo merchant;
    private String description;
    private BigDecimal amount;

    public PixBo() {
    }

    public PixBo(String key, MerchantBo merchant, String description, String qrCode, BigDecimal amount) {
        this.key = key;
        this.merchant = merchant;
        this.description = description;
        this.qrCode = qrCode;
        this.amount = amount;
    }

    public MerchantBo getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantBo merchant) {
        this.merchant = merchant;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
