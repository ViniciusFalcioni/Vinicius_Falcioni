package org.apicellcoin.domain.dto;

public class PixCelcoinDTO {
    private String id;
    private String key;
    private Double amount;
    private String QRCode;
    private MerchantDTO merchant;
    private Long transactionId;
    private String base64QrCode;

    public String getBase64QrCode() {
        return base64QrCode;
    }

    public void setBase64QrCode(String base64QrCode) {
        this.base64QrCode = base64QrCode;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getQRCode() {
        return this.QRCode;
    }

    public void setQrCode(String qrCode) {
        this.QRCode = qrCode;
    }

    public MerchantDTO getMerchant() {
        return this.merchant;
    }

    public void setMerchant(MerchantDTO merchant) {
        this.merchant = merchant;
    }

    public Long getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

}