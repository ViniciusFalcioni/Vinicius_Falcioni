package org.diego.infra.repositories.panache.mappers;

import org.diego.domain.entities.QrCode;
import org.diego.infra.repositories.panache.entities.PanachePixCode;

public class PanachePixCodeMapper {
    public PanachePixCode toEntity(QrCode qrCode, String emv, Integer transactionId) {
        PanachePixCode entity = new PanachePixCode();
        entity.setAmount(qrCode.getAmount());
        entity.setEmvqrcps(emv);
        entity.setKey(qrCode.getKey());
        entity.setTransactionId(transactionId);
        
        return entity;
    }
}
