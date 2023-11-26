package org.bortoli.infra.panache;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.bortoli.domain.entities.PixQrCodeBO;
import org.bortoli.domain.repositories.IPixQrCodeDataBaseRepository;
import org.bortoli.infra.panache.mapper.PanachePixQrCodeMapper;

@ApplicationScoped
public class PanacheDataBaseRepository implements IPixQrCodeDataBaseRepository {
    @Transactional
    public PixQrCodeBO persist(PixQrCodeBO bo) {
        PanachePixQrCode entity = PanachePixQrCodeMapper.toEntity(bo);
        entity.persistAndFlush();
        return PanachePixQrCodeMapper.toDomain(entity);
    }
}