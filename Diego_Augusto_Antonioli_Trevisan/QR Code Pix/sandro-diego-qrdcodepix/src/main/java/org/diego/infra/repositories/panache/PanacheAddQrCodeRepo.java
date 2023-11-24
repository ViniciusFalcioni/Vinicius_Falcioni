package org.diego.infra.repositories.panache;

import org.diego.domain.contracts.IAddQrCodeRepo;
import org.diego.domain.entities.QrCode;
import org.diego.infra.repositories.panache.mappers.PanachePixCodeMapper;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanacheAddQrCodeRepo implements IAddQrCodeRepo {

    @Override
    public void add(QrCode qrCode, Integer transactionId, String emv) {
        PanachePixCodeMapper mapper = new PanachePixCodeMapper();
        var entity = mapper.toEntity(qrCode, emv, transactionId);

        entity.persistAndFlush();
    }

}
