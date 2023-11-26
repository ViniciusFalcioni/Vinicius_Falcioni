package com.github.faening.domain.dto;

public class PixQrCodeDTO {
    private String id;
    private String key;
    private Double amount;
    private String transactionIdentification;
    private String postalCode;
    private String city;
    private String merchantCategoryCode;
    private String name;
    private String emvqrcps;
    private String transactionId;

    public PixQrCodeDTO(
        String id,
        String key,
        Double amount,
        String transactionIdentification,
        String postalCode,
        String city,
        String merchantCategoryCode,
        String name,
        String emvqrcps,
        String transactionId
    ) {
        this.id = id;
        this.key = key;
        this.amount = amount;
        this.transactionIdentification = transactionIdentification;
        this.postalCode = postalCode;
        this.city = city;
        this.merchantCategoryCode = merchantCategoryCode;
        this.name = name;
        this.emvqrcps = emvqrcps;
        this.transactionId = transactionId;
    }

    public PixQrCodeDTO() { }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmvqrcps() {
        return emvqrcps;
    }

    public void setEmvqrcps(String emvqrcps) {
        this.emvqrcps = emvqrcps;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
