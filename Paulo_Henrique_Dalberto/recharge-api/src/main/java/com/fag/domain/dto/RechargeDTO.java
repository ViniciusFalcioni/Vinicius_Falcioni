package com.fag.domain.dto;

public class RechargeDTO {
    private String id;
    private Double value;
    private String document;
    private Integer operatorId;
    private PhoneDTO phone;
    private String receipt;
    private Long transactionId;
    private boolean success;
    

    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return Double return the value
     */
    public Double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * @return String return the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * @return Integer return the operatorId
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId the operatorId to set
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * @return PhoneDTO return the phone
     */
    public PhoneDTO getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(PhoneDTO phone) {
        this.phone = phone;
    }

    /**
     * @return String return the receipt
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * @param receipt the receipt to set
     */
    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    /**
     * @return Long return the transactionId
     */
    public Long getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId the transactionId to set
     */
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return boolean return the sucess
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param sucess the sucess to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

}
