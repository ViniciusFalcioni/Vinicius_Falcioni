package com.fag.infra.celcoin.dto;

public record CelcoinRechargeResponseDTO(Integer nsuNameProvider, Integer authentication, CelcoinRechargeReceiptDTO receipt, String settleDate, String createDate, Long transactionId, String urlReceipt, String errorCode, String message, Integer status, boolean success) {
}
