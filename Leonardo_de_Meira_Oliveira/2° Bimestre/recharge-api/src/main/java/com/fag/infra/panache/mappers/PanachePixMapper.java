package com.fag.infra.panache.mappers;

import com.fag.domain.entities.PixBO;
import com.fag.infra.panache.model.PanachePixCode;

public class PanachePixMapper {

    public static PixBO toDomain(PanachePixCode entity) {
        return new PixBO(
                entity.getId(),
                entity.getKey(),
                entity.getAmount(),
                entity.getEmvqrcps(),
                entity.getTransactionId()
        );
    }

    public static PanachePixCode toEntity(PixBO bo) {
        PanachePixCode entity = new PanachePixCode();

        entity.setId(bo.id());
        entity.setKey(bo.key());
        entity.setTransactionId(bo.transactionId());
        entity.setEmvqrcps(bo.qrCode());
        entity.setAmount(bo.amount());

        return entity;
    }

}