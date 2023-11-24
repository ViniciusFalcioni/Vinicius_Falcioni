package main.java.org.example.domain.entities;

import java.math.BigDecimal;
import java.util.UUID;

public class RechargeBO {
    private UUID id;
    private BigDecimal value;
    private String document;
    private Integer providerId;
    private PhoneBO phone;
    private String receipt;
    private Long transactionId;
    private boolean success;

    public UUID getId() {
        return id;
    }


    public BigDecimal getValue() {
        return value;
    }


    public String getDocument() {
        return document;
    }


    public Integer getProviderId() {
        return providerId;
    }


    public PhoneBO getPhone() {
        return phone;
    }


    public String getReceipt() {
        return receipt;
    }


    public Long getTransactionId() {
        return transactionId;
    }


    public boolean isSuccess() {
        return success;
    }

    public RechargeBO(UUID id, BigDecimal value, String document, Integer providerId, PhoneBO phone, String receipt, Long transactionId, boolean success) {
        this.id = id;
        this.value = value;
        this.document = document;
        this.providerId = providerId;
        this.phone = phone;
        this.receipt = receipt;
        this.transactionId = transactionId;
        this.success = success;
    }
}
