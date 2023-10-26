package org.example.domain.entities;

public class RechargeBO {
    private String id;
    private Double value;
    private String document;
    private Integer providerId;
    private PhoneBO phone;
    private String receipt;
    private Long transactionId;
    private boolean success;

    public String getId() {
        return id;
    }


    public Double getValue() {
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

}
