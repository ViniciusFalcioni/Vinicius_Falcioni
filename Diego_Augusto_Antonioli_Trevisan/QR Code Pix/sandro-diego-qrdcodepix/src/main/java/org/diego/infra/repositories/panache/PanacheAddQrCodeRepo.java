package org.diego.infra.repositories.panache;

import org.diego.domain.contracts.IAddQrCodeRepo;
import org.diego.domain.entities.QrCode;
import org.diego.infra.repositories.panache.entities.PanachePixCode;
import org.diego.infra.repositories.panache.mappers.PanachePixCodeMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PanacheAddQrCodeRepo implements IAddQrCodeRepo {

    @Transactional
    @Override
    public void add(QrCode qrCode, Integer transactionId, String emv) {
        PanachePixCodeMapper mapper = new PanachePixCodeMapper();
        PanachePixCode entity = mapper.toEntity(qrCode, emv, transactionId);
        entity.persistAndFlush();
    }

}
