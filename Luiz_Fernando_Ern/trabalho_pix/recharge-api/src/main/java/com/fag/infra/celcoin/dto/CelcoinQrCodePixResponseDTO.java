package com.fag.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinQrCodePixResponseDTO {
    private Long transactionId;
    private String emvqrcps;
    private String additionalInformation;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    @JsonbProperty(value = "emvqrcps")
    public String getQrCode() {
        return emvqrcps;
    }

    @JsonbProperty(value = "emvqrcps")
    public void setQrCode(String qrCode) {
        this.emvqrcps = qrCode;
    }

    @JsonbProperty(value = "additionalInformation")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    @JsonbProperty(value = "additionalInformation")
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }
}