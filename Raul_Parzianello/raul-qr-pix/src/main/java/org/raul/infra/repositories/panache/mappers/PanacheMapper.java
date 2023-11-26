package org.raul.infra.repositories.panache.mappers;

import org.raul.domain.entities.QrCode;
import org.raul.infra.repositories.panache.entities.PanachePixCode;

public class PanacheMapper {
    public PanachePixCode toEntity(QrCode qrCode, String emv, Integer transactionId) {
        PanachePixCode entity = new PanachePixCode();
        entity.setAmount(qrCode.getAmount());
        entity.setEmvqrcps(emv);
        entity.setKey(qrCode.getKey());
        entity.setTransactionId(transactionId);
        
        return entity;
    }
}
