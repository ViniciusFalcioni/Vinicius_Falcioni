package org.example.infra.panache.mappers;

import org.example.domain.entities.PhoneBO;
import org.example.domain.entities.RechargeBO;
import org.example.infra.panache.model.PanacheRecharge;

public class PanacheRechargeMapper {

    public static RechargeBO toDomain(PanacheRecharge entity) {
        Integer countryCode = Integer.valueOf(entity.getPhoneNumber().substring(0,2));
        Integer stateCode = Integer.valueOf(entity.getPhoneNumber().substring(2,4));
        String number = entity.getPhoneNumber().substring(4, entity.getPhoneNumber().length());

        return new RechargeBO(
                entity.getId(),
                entity.getValue(),
                entity.getDocument(),
                entity.getOperatorId(),
                new PhoneBO(countryCode, stateCode, number),
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
        entity.setReceipt(bo.getReceipt());
        entity.setSuccess(bo.isSuccess());
        entity.setOperatorId(bo.getProviderId());
        entity.setPhoneNumber(phone);

        return entity;
    }
}
