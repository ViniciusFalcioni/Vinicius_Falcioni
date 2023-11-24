package com.fag.infra.panache.mappers;

import com.fag.domain.entities.PixCelcoinBO;
import com.fag.infra.panache.model.PanachePixCode;

public class PanachePixMapper {
    public static PixCelcoinBO toDomain(PanachePixCode entity) {
        return new PixCelcoinBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(),
                entity.getTransactionId());
    }
    public static PanachePixCode toEntity(PixCelcoinBO bo) {
        PanachePixCode entity = new PanachePixCode();
        entity.setId(bo.getId());
        entity.setKey(bo.getKey());
        entity.setTransactionId(bo.getTransactionId());
        entity.setEmvqrcps(bo.getQrCode());
        entity.setAmount(bo.getAmount());
        return entity;
    }
}
