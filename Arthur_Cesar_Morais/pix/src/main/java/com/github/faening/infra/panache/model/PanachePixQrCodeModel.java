package com.github.faening.infra.panache.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name="faening_pixqrcode")
public class PanachePixQrCodeModel extends PanacheEntityBase {
    @Id
    private UUID id;
    private String merchantCategoryCode;
    private String postalCode;
    private String city;
    private String name;
    private String key;
    private Double amount;
    private String transactionIdentification;
    private String transactionId;
    @Column(length = 1000)
    private String emvqrcps;

    public PanachePixQrCodeModel(UUID id, String merchantCategoryCode, String postalCode, String city, String name, String key, Double amount, String transactionIdentification, String transactionId, String emvqrcps) {
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

    public PanachePixQrCodeModel() {}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
