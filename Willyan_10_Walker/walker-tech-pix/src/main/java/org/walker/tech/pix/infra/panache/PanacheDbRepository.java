package org.walker.tech.pix.infra.panache;

import org.walker.tech.pix.domain.dto.PixDto;
import org.walker.tech.pix.domain.entities.PixBo;
import org.walker.tech.pix.domain.repositories.IPixDbRepository;
import org.walker.tech.pix.infra.panache.mapper.PanachePixMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PanacheDbRepository implements IPixDbRepository {

    @Override
    @Transactional
    public PixBo persist(PixBo bo) {
        PanachePix pix = PanachePixMapper.toEntity(bo);
        pix.persistAndFlush();
        return PanachePixMapper.toDomain(pix);
    }

    public void persist(PixDto generatedPix) {
    }
}
