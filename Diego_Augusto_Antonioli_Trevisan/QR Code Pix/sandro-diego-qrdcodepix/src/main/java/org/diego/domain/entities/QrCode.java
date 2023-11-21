package org.diego.domain.entities;

public class QrCode {
    private Merchant merchant;

    private Double amount;

    private String key;

    private String base64;

    public QrCode(Merchant merchant, Double amount, String key, String base64) {
        this.merchant = merchant;
        this.amount = amount;
        this.key = key;
        this.base64 = base64;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public Double getAmount() {
        return amount;
    }

    public String getKey() {
        return key;
    }

    public String getBase64() {
        return base64;
    }

}
