package br.com.fag.domain.entities;

import java.util.UUID;

public class RechargeBO {
  private UUID id;
  private Double value;
  private String document;
  private Integer providerId;
  private PhoneBO phone;
  private String receipt;
  private Long transactionId;
  private Boolean isSuccess;

  public RechargeBO() {
  }

  public RechargeBO(UUID id, Double value, String document, Integer providerId, PhoneBO phone, String receipt,
      Long transactionId, Boolean isSuccess) {
    this.id = id;
    this.value = value;
    this.document = document;
    this.providerId = providerId;
    this.phone = phone;
    this.receipt = receipt;
    this.transactionId = transactionId;
    this.isSuccess = isSuccess;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Double getValue() {
    return this.value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public String getDocument() {
    return this.document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public Integer getProviderId() {
    return this.providerId;
  }

  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }

  public PhoneBO getPhone() {
    return this.phone;
  }

  public void setPhone(PhoneBO phone) {
    this.phone = phone;
  }

  public String getReceipt() {
    return this.receipt;
  }

  public void setReceipt(String receipt) {
    this.receipt = receipt;
  }

  public Long getTransactionId() {
    return this.transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public Boolean isSuccess() {
    return this.isSuccess;
  }

  public Boolean getIsSuccess() {
    return this.isSuccess;
  }

  public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
  }

}
