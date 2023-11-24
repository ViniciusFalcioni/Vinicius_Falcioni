package org.apicellcoin.infra.panache.mappers;

import org.apicellcoin.domain.entities.CelcoinPixBO;
import org.apicellcoin.infra.panache.model.PanachePixCode;

public class PanachePixMapper {
    public static CelcoinPixBO toDomain(PanachePixCode entity) {

        return new CelcoinPixBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(),
                entity.getTransactionId());
    }

    public static PanachePixCode toEntity(CelcoinPixBO bo) {
        PanachePixCode entity = new PanachePixCode();
        entity.setId(bo.getId());
        entity.setKey(bo.getKey());
        entity.setTransactionId(bo.getTransactionId());
        entity.setEmvqrcps(bo.getQrCode());
        entity.setAmount(bo.getAmount());

        return entity;
    }

}