package com.fag.infra.celcoin.dto.pix;

import jakarta.json.bind.annotation.JsonbProperty;

public class PixQrCodeResponseDTO {
    private Long transactionId;
    private String emvqrcps;

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
}
