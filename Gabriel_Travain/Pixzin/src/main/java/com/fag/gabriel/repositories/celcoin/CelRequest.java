package com.fag.gabriel.repositories.celcoin;

import java.util.List;

public class CelRequest {
  private String key;
  private Double amount;
  private String transactionIdentification;
  private CelMerchant merchant;
  private List<String> tags;
  private String additionalInformation;
  private boolean withdrawal;
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }
  public String getTransactionIdentification() {
    return transactionIdentification;
  }
  public void setTransactionIdentification(String transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
  }
  public CelMerchant getMerchant() {
    return merchant;
  }
  public void setMerchant(CelMerchant merchant) {
    this.merchant = merchant;
  }
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public String getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }
  public CelRequest(String key, Double amount, String transactionIdentification, CelMerchant merchant,
      List<String> tags, String additionalInformation, boolean withdrawal) {
    this.key = key;
    this.amount = amount;
    this.transactionIdentification = transactionIdentification;
    this.merchant = merchant;
    this.tags = tags;
    this.additionalInformation = additionalInformation;
    this.withdrawal = withdrawal;
  }
  public boolean isWithdrawal() {
    return withdrawal;
  }
  public void setWithdrawal(boolean withdrawal) {
    this.withdrawal = withdrawal;
  }
}
