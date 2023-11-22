package com.fag.domain.dto;

import java.math.BigDecimal;

public record PixDTO(String id, String key, BigDecimal amount, String qrCode, MerchantDTO merchant, Long transactionId) {

    public PixDTO withQrCode(String qrCode) {
        return new PixDTO(id(), key(), amount(), qrCode, merchant(), transactionId());
    }

    public PixDTO withTransactionId(Long transactionId) {
        return new PixDTO(id(), key(), amount(), qrCode(), merchant(), transactionId);
    }

}
