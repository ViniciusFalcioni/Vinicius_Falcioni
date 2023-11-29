package com.fag.infra.celcoin.dto;


public class CelcoinPixResponseDTO {

    private Long transactionId;
    private String QRCode;
    
    public Long getTransactionId() {
        return this.transactionId;
    }
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
    public String getQRCode() {
        return this.QRCode;
    }
    public void setQRCode(String QRCode) {
        this.QRCode = QRCode;
    }
}
