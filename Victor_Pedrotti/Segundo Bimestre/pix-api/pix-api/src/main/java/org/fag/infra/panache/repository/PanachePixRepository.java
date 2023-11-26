package org.fag.infra.panache.repository;

import org.fag.domain.entities.PixBO;
import org.fag.domain.repositories.IPixDataBaseRepository;
import org.fag.infra.panache.mappers.PanachePixMapper;
import org.fag.infra.panache.model.PanachePix;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanachePixRepository implements IPixDataBaseRepository {
    
    @Override
    public PixBO persist(PixBO bo) {
        PanachePix entity = PanachePixMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanachePixMapper.toDomain(entity);
    }
}
