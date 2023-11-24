package br.com.fag.domain.dto;

public class RechargeDTO {
  private String id;
  private Double value;
  private String document;
  private Integer operatorId;
  private PhoneDTO phone;
  private String receipt;
  private Long transactionId;
  private Boolean success;

  public RechargeDTO() {
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
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

  public PhoneDTO getPhone() {
    return this.phone;
  }

  public void setPhone(PhoneDTO phone) {
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
    return this.success;
  }

  public Boolean getSuccess() {
    return this.success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

}
