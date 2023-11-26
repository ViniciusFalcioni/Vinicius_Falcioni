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
    @Column
    private String key;
    @Column
    private Double amount;
    @Column
    private String transactionIdentification;
    @Column
    private String postalCode;
    @Column
    private String city;
    @Column
    private String merchantCategoryCode;
    @Column
    private String name;
    @Column
    private String emvqrcps;
    @Column
    private String transactionId;

    public PanachePixQrCodeModel(
            UUID id,
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

    public PanachePixQrCodeModel() { }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
