package com.fag.infra.panache.model;

import java.util.UUID;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AKT_RECHARGE")
public class PanacheRecharge extends PanacheEntityBase {

  @Id
  private UUID id;

  @Column(name = "AMOUNT")
  private Double value;

  @Column(name = "DOCUMENT")
  private String document;

  @Column(name = "OPERATOR_ID")
  private Integer operatorId;

  @Column(name = "PHONE_NUMBER")
  private String phoneNumber;

  @Column(name = "RECEIPT", length = 4000)
  private String receipt;

  @Column(name = "TRANSACTIONID")
  private Long transactionId;

  @Column(name = "SUCCESS")
  private boolean success;

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

  public Integer getOperatorId() {
    return this.operatorId;
  }

  public void setOperatorId(Integer operatorId) {
    this.operatorId = operatorId;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
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

  public boolean isSuccess() {
    return this.success;
  }

  public boolean getSuccess() {
    return this.success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }


}
