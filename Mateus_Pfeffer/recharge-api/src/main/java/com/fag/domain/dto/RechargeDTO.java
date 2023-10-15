package com.fag.domain.dto;

public record RechargeDTO(String id, Double value, String document, Integer operatorId, PhoneDTO phone, String receipt, Long transactionId, boolean success) {
}
