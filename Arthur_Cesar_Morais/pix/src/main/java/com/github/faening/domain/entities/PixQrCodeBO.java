package com.github.faening.domain.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import java.util.UUID;

public class PixQrCodeBO extends PanacheEntityBase {
    private UUID id;
    private String key;
    private Double amount;
    private String transactionIdentification;
    private String postalCode;
    private String city;
    private String merchantCategoryCode;
    private String name;
    private String emvqrcps;
    private String transactionId;

    public PixQrCodeBO(
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
        this.id = (id != null) ? UUID.fromString(id) : UUID.randomUUID();
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

    public UUID getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public Double getAmount() {
        return amount;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public String getName() {
        return name;
    }

    public String getEmvqrcps() {
        return emvqrcps;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
