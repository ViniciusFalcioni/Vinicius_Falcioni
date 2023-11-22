package com.fag.infra.celcoin.dto;

import java.math.BigDecimal;

public record CelcoinPixDTO(String key, BigDecimal amount, CelcoinMerchantDTO merchant, String transactionId) {
}
