package com.fag.Infra.Panache.Mappers;

import com.fag.Domain.Entities.PhoneBO;
import com.fag.Domain.Entities.RechargeBO;
import com.fag.Infra.Panache.Model.PanacheRecharge;

import io.quarkus.hibernate.orm.panache.Panache;

public class PanacheRechargeMapper {

    public static RechargeBO toDomain(PanacheRecharge entity) {
        Integer countryCode = Integer.valueOf(entity.getPhoneNumber().substring(0, 2));
        Integer stateCode = Integer.valueOf(entity.getPhoneNumber().substring(2, 4));
        String number = entity.getPhoneNumber().substring(4, entity.getPhoneNumber().length());

        return new RechargeBO(
                entity.getId(),
                entity.getValue(),
                entity.getDocument(),
                entity.getOperatorId(),
                new PhoneBO(stateCode, countryCode, number),
                entity.getReceipt(),
                entity.getTransactionId(),
                entity.getSuccess());
    }

    public static PanacheRecharge toEntity(RechargeBO bo) {
        PanacheRecharge entity = new PanacheRecharge();
        String phone = bo.getPhone().getCountryCode().toString()
                .concat(bo.getPhone().getStateCode().toString())
                .concat(bo.getPhone().getNumber());

        entity.setId(bo.getId());
        entity.setValue(bo.getValue());
        entity.setDocument(bo.getDocument());
        entity.setOperatorId(bo.getOperatorId());
        entity.setPhoneNumber(phone);
        entity.setTransactionId(bo.getTransactionId());
        entity.setReceipt(bo.getReceipt());
        entity.setSuccess(bo.getSuccess());

        return entity;
    }
}