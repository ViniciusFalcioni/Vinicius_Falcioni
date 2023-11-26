package org.raul.infra.repositories.panache;

import org.raul.domain.contracts.IQrCodeRepository;
import org.raul.domain.entities.QrCode;
import org.raul.infra.repositories.panache.entities.PanachePixCode;
import org.raul.infra.repositories.panache.mappers.PanacheMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PanacheAddQrCodeRepository implements IQrCodeRepository {

    @Transactional
    @Override
    public void add(QrCode qrCode, Integer transactionId, String emv) {
        PanacheMapper mapper = new PanacheMapper();
        PanachePixCode entity = mapper.toEntity(qrCode, emv, transactionId);
        entity.persistAndFlush();
    }

}
