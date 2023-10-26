package com.fag.domain.dto;

public record RechargeDTO(String id, Double value, String document, Integer operatorId, PhoneDTO phone, String receipt, Long transactionId, boolean success) {

    public RechargeDTO withReceipt(String receipt) {
        return new RechargeDTO(id(), value(), document(), operatorId(), phone(), receipt, transactionId(), success());
    }

    public RechargeDTO withTransactionId(Long transactionId) {
        return new RechargeDTO(id(), value(), document(), operatorId(), phone(), receipt(), transactionId, success());
    }

    public RechargeDTO withSuccess(boolean success) {
        return new RechargeDTO(id(), value(), document(), operatorId(), phone(), receipt(), transactionId(), success);
    }

}
