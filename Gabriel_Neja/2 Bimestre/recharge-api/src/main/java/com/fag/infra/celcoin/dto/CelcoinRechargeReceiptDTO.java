package com.fag.infra.celcoin.dto;

public class CelcoinRechargeReceiptDTO {

    private String receiptData;
    private String receiptformatted;

    public void setReceiptData(String receiptData) {
        this.receiptData = receiptData;
    }
    public void setReceiptformatted(String receiptformatted) {
        this.receiptformatted = receiptformatted;
    }
    
    public String getReceiptData() {
        return receiptData;
    }
    public String getReceiptformatted() {
        return receiptformatted;
    }
    
}
