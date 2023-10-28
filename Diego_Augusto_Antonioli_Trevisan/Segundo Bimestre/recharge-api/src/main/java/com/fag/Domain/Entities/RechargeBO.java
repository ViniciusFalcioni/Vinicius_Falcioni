package com.fag.Domain.Entities;

import java.util.UUID;

public class RechargeBO {
    private UUID id;
    private Double value;
    private String document;
    private int operatorId;
    private PhoneBO phone;
    private String receipt;
    private Long transactionId;
    private Boolean success;

    public RechargeBO(UUID id, Double value, String document, int operatorId, PhoneBO phone, String receipt,
            Long transactionId, Boolean success) {
        this.id = id;
        this.value = value;
        this.document = document;
        this.operatorId = operatorId;
        this.phone = phone;
        this.receipt = receipt;
        this.transactionId = transactionId;
        this.success = success;
    }

    public UUID getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    public String getDocument() {
        return document;
    }

    public int getOperatorId() {
        return operatorId;
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

    public Boolean getSuccess() {
        return success;
    }
}