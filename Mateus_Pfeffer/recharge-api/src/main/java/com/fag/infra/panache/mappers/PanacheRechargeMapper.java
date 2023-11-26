package com.fag.infra.panache.mappers;

import com.fag.domain.entities.PhoneBO;
import com.fag.domain.entities.RechargeBO;
import com.fag.infra.panache.model.PanacheRecharge;

public class PanacheRechargeMapper {

    public static RechargeBO toDomain(PanacheRecharge entity) {
        Integer countryCode = Integer.valueOf(entity.getPhoneNumber().substring(0, 2));
        Integer stateCode = Integer.valueOf(entity.getPhoneNumber().substring(2, 4));
        String number = entity.getPhoneNumber().substring(4);

        return new RechargeBO(
                entity.getId(),
                entity.getValue(),
                entity.getDocument(),
                entity.getOperatorId(),
                new PhoneBO(countryCode, stateCode, number),
                entity.getReceipt(),
                entity.getTransactionId(),
                entity.isSuccess()
        );
    }

    public static PanacheRecharge toEntity(RechargeBO bo) {
        PanacheRecharge entity = new PanacheRecharge();
        String phone = bo.phone().countryCode().toString()
                .concat(bo.phone().stateCode().toString())
                .concat(bo.phone().number());

        entity.setId(bo.id());
        entity.setValue(bo.value());
        entity.setDocument(bo.document());;
        entity.setOperatorId(bo.providerId());
        entity.setPhoneNumber(phone);
        entity.setTransactionId(bo.transactionId());
        entity.setReceipt(bo.receipt());
        entity.setSuccess(bo.success());

        return entity;
    }

}
