package org.fag.trab.domain.entities;

import java.math.BigDecimal;
import java.util.UUID;

public class PixBo {
    private String id;
    private String qrcode;
    private String key;
    private MerchantBo merchant;
    private String description;
    private BigDecimal amount;

    public PixBo() {
    }

    public PixBo(String key, MerchantBo merchant, String description, String qrcode, BigDecimal amount) {
        this.key = key;
        this.merchant = merchant;
        this.description = description;
        this.qrcode = qrcode;
        this.amount = amount;
    }

    public MerchantBo getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantBo merchant) {
        this.merchant = merchant;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQrcode() {
        return this.qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
