package com.fag.domain.entities;

import java.math.BigDecimal;
import java.util.UUID;

public record PixBO(UUID id, String key, BigDecimal amount, String qrCode, Long transactionId) {
}