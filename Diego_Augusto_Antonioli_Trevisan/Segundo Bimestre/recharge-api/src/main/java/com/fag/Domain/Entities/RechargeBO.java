package com.fag.Domain.Entities;

import java.util.UUID;

public class RechargeBO {
    private UUID id;
    private Double value;
    private String document;
    private int providerId;
    private PhoneBO phone;
    private String receipt;
    private Long transactionId;
    private Boolean success;

    public RechargeBO(UUID id, Double value, String document, int providerId, PhoneBO phone, String receipt,
            Long transactionId, Boolean success) {
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
     * @return int return the providerId
     */
    public int getProviderId() {
        return providerId;
    }

    /**
     * @return PhoneBO return the phone
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
     * @return Boolean return the success
     */
    public Boolean isSuccess() {
        return success;
    }

}
