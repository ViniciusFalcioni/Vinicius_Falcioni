package com.fag.domain.entities;

import java.util.UUID;

public class RechargeBO {
    private UUID id;
    private Double value;
    private String document;
    private Integer providerId;
    private PhoneBO phone;
    private String receipt;
    private Long transactionId;
    private boolean success;

    public RechargeBO(UUID id, Double value, String document, Integer providerId, PhoneBO phone, String receipt, Long transactionId, boolean success) {
        this.id = id;
        this.value = value;
        this.document = document;
        this.providerId = providerId;
        this.phone = phone;
        this.receipt = receipt;
        this.transactionId = transactionId;
        this.success = success;
    }
    

    /**
     * @return UUID return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * @return Double return the value
     */
    public Double getValue() {
        return value;
    }

    /**
     * @return String return the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * @return Integer return the providerId
     */
    public Integer getProviderId() {
        return providerId;
    }

    /**
     * @return PhoneDTO return the phone
     */
    public PhoneBO getPhone() {
        return phone;
    }

    /**
     * @return String return the receipt
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * @return Long return the transactionId
     */
    public Long getTransactionId() {
        return transactionId;
    }

    /**
     * @return boolean return the success
     */
    public boolean isSuccess() {
        return success;
    }

    public void handleSuccess(String receipt, Long transactionId) {
        this.receipt = receipt;
        this.transactionId = transactionId;
        this.success = true;
    }

    public void handleError() {
        this.success = false;
    }
}
