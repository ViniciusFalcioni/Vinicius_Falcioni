package br.com.fag.infra.celcoin.dto;

public class CelcoinRechargeReceiptDTO {
  private String receiptData;
  private String receiptFormatted;

  public CelcoinRechargeReceiptDTO() {
  }

  public CelcoinRechargeReceiptDTO(String receiptData, String receiptFormatted) {
    this.receiptData = receiptData;
    this.receiptFormatted = receiptFormatted;
  }

  public String getReceiptData() {
    return this.receiptData;
  }

  public void setReceiptData(String receiptData) {
    this.receiptData = receiptData;
  }

  public String getReceiptFormatted() {
    return this.receiptFormatted;
  }

  public void setReceiptFormatted(String receiptFormatted) {
    this.receiptFormatted = receiptFormatted;
  }

}
