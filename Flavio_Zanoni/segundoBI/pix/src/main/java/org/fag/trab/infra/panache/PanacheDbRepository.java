package org.fag.trab.infra.panache;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.fag.trab.domain.entities.PixBo;
import org.fag.trab.domain.repositories.IPixDbRepository;
import org.fag.trab.infra.panache.mapper.PanachePixMapper;

@ApplicationScoped
public class PanacheDbRepository implements IPixDbRepository {

    @Override
    @Transactional
    public PixBo persist(PixBo bo) {
        PanachePix pix = PanachePixMapper.toEntity(bo);

        pix.persistAndFlush();

        return PanachePixMapper.toDomain(pix);
    }
}