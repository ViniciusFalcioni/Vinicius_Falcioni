package com.fag.domain.entities;

import java.util.UUID;

public class QrcodePixBO {
    private UUID id;
    private String key;
    private Double amount;
    private String qrCode;
    private Long transactionId;
    private String additionalInformation;

    public QrcodePixBO(UUID id, String key, Double amount, String qrCode, Long transactionId, String additionalInformation) {
        this.id = UUID.randomUUID();
        this.key = key;
        this.qrCode = qrCode;
        this.amount = amount;
        this.transactionId = transactionId;
        this.additionalInformation = additionalInformation;
    }

    public UUID getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getQrCode() {
        return qrCode;
    }

    public Double getAmount() {
        return amount;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }
}