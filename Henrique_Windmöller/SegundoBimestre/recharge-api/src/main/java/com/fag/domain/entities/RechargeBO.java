package main.java.com.fag.domain.entities;

import java.util.UUID;

public class RechargeBO {
   private UUID id;
   private Double value;
   private String document;
   private INteger providerld;
   private PhoneBO phone;
   private String receipt;
   private Long transactionld;
   private boolean success;
   
public RechargeBO(UUID id, Double value, String document, INteger providerld, PhoneBO phone, String receipt,
        Long transactionld, boolean success) {
    this.id = id;
    this.value = value;
    this.document = document;
    this.providerld = providerld;
    this.phone = phone;
    this.receipt = receipt;
    this.transactionld = transactionld;
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
public INteger getProviderld() {
    return providerld;
}
public PhoneBO getPhone() {
    return phone;
}
public String getReceipt() {
    return receipt;
}
public Long getTransactionld() {
    return transactionld;
}
public boolean isSuccess() {
    return success;
}
    
}
