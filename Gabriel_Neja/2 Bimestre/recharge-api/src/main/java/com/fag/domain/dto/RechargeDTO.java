package com.fag.domain.dto;

public class RechargeDTO {
    private String id;
    private String document;
    private String receipt;
    private Double value;
    private PhoneDTO phone;
    private Integer operatorId;
    private Long transactionId;
    private boolean success;
    
    public void setId(String id) {
        this.id = id;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }
    public void setValue(Double value) {
        this.value = value;
    }
    public void setPhone(PhoneDTO phone) {
        this.phone = phone;
    }
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public String getId() {
        return id;
    }
    public String getDocument() {
        return document;
    }
    public String getReceipt() {
        return receipt;
    }
    public Double getValue() {
        return value;
    }
    public PhoneDTO getPhone() {
        return phone;
    }
    public Integer getOperatorId() {
        return operatorId;
    }
    public Long getTransactionId() {
        return transactionId;
    }
    public boolean isSuccess() {
        return success;
    }
    
}
