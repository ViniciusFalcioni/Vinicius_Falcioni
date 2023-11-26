package org.example.domain.entities;

import org.example.domain.dto.MerchantDTO;

import java.math.BigDecimal;
import java.util.UUID;

public class PixBO {
    private UUID id;
    private String key;
    private BigDecimal amount;
    private String qrCode;
    private Long transactionId;
    private MerchantBO merchantBO;

    public MerchantBO getMerchantBO() {
        return merchantBO;
    }

    public UUID getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getQrCode() {
        return qrCode;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public PixBO(UUID id, String key, BigDecimal amount, String qrCode, Long transactionId, MerchantBO merchantBO) {
        this.id = id;
        this.key = key;
        this.amount = amount;
        this.qrCode = qrCode;
        this.transactionId = transactionId;
        this.merchantBO = merchantBO;
    }
}
