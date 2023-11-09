package com.fag.Domain.Entities;

import java.util.UUID;

public class RechargeBO {
    private UUID id;
    private Double value;
    private String document;
    private Integer operatorId;
    private PhoneBO phone;
    private String receipt;
    private Long transactionId;
    private Boolean success;

    public void handleSuccess(String receipt, Long transactionId) {
        this.receipt = receipt;
        this.transactionId = transactionId;
        this.success = true;
    }

    public void handleError() {
        this.success = false;
    }

    public RechargeBO(UUID id, Double value, String document, Integer operatorId, PhoneBO phone, String receipt,
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

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public PhoneBO getPhone() {
        return phone;
    }

    public void setPhone(PhoneBO phone) {
        this.phone = phone;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    
}