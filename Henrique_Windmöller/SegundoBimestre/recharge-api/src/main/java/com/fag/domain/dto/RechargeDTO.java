package main.java.com.fag.domain.dto;

public class RechargeDTO {
   String id;
   Double value;
   String document;
   Integer providerld;
   PhoneDTO phone;
   String receipt;
   Long transactionld;
   boolean success;

public String getId() {
    return id;
}
public void setId(String id) {
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
public Integer getProviderld() {
    return providerld;
}
public void setProviderld(Integer providerld) {
    this.providerld = providerld;
}
public PhoneDTO getPhone() {
    return phone;
}
public void setPhone(PhoneDTO phone) {
    this.phone = phone;
}
public String getReceipt() {
    return receipt;
}
public void setReceipt(String receipt) {
    this.receipt = receipt;
}
public Long getTransactionld() {
    return transactionld;
}
public void setTransactionld(Long transactionld) {
    this.transactionld = transactionld;
}
public boolean getSuccess() {
    return success;
}
public void setSuccess(boolean success) {
    this.success = success;
}
}
