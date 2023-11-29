package com.github.faening.domain.dto;

public class PixQrCodeDTO {
    private String id;
    private String merchantCategoryCode;
    private String postalCode;
    private String city;
    private String name;
    private String key;
    private Double amount;
    private String transactionIdentification;
    private String transactionId;
    private String emvqrcps;

    public PixQrCodeDTO(String id, String merchantCategoryCode, String postalCode, String city, String name, String key, Double amount, String transactionIdentification, String transactionId, String emvqrcps) {
        this.id = id;
        this.merchantCategoryCode = merchantCategoryCode;
        this.postalCode = postalCode;
        this.city = city;
        this.name = name;
        this.key = key;
        this.amount = amount;
        this.transactionIdentification = transactionIdentification;
        this.transactionId = transactionId;
        this.emvqrcps = emvqrcps;
    }

    public PixQrCodeDTO(String merchantCategoryCode, String postalCode, String city, String name, String key, Double amount, String transactionIdentification) {
        this.merchantCategoryCode = merchantCategoryCode;
        this.postalCode = postalCode;
        this.city = city;
        this.name = name;
        this.key = key;
        this.amount = amount;
        this.transactionIdentification = transactionIdentification;
    }

    public PixQrCodeDTO() { }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getEmvqrcps() {
        return emvqrcps;
    }

    public void setEmvqrcps(String emvqrcps) {
        this.emvqrcps = emvqrcps;
    }
}
