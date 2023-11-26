package com.fag.domain.entities;

import java.math.BigDecimal;
import java.util.UUID;

public record RechargeBO(UUID id, BigDecimal value, String document, Integer providerId, PhoneBO phone, String receipt, Long transactionId, boolean success) {

    public RechargeBO handleSuccess(String receipt, Long transactionId) {
        return new RechargeBO(id(), value(), document(), providerId(), phone(), receipt, transactionId, true);
    }

    public RechargeBO handleError() {
        return new RechargeBO(id(), value(), document(), providerId(), phone(), receipt(), transactionId(), false);
    }

}
