package com.fag.domain.dto;

import java.math.BigDecimal;

public record PixDTO(String id, String key, BigDecimal amount, String qrCode, MerchantDTO merchant, Long transactionId) {

    public PixDTO QrCode(String qrCode) {
        return new PixDTO(id(), key(), amount(), qrCode, merchant(), transactionId());
    }

    public PixDTO TransactionId(Long transactionId) {
        return new PixDTO(id(), key(), amount(), qrCode(), merchant(), transactionId);
    }

}