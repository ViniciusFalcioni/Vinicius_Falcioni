package com.fag.domain.entities;

import java.math.BigDecimal;
import java.util.UUID;

public record RechargeBO(UUID id, BigDecimal value, String document, Integer providerId, PhoneBO phone, String receipt, Long transactionId, boolean success) {

}
