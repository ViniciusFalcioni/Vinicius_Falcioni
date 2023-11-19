package main.java.com.fag.domain.entities;

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
   
public RechargeBO(UUID id, Double value, String document, Integer providerld, PhoneBO phone, String receipt,
        Long transactionld, boolean success) {
    this.id = id;
    this.value = value;
    this.document = document;
    this.providerId = providerId;
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
public PhoneBO getPhone() {
    return phone;
}
public String getReceipt() {
    return receipt;
}
public boolean isSuccess() {
    return success;
}
public Integer getProviderId() {
    return providerId;
}
public Long getTransactionId() {
    return transactionId;
}

public void handleSuccess(String receipt, Long transactionId){
    this.receipt = receipt;
    this.transactionId = transactionId;
    this.success=true;
}
public void handleError(){
    this.success=false;
}
}
