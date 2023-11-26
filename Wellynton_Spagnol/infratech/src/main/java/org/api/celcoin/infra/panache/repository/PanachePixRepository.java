package org.api.celcoin.infra.panache.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.api.celcoin.domain.entities.PixBO;
import org.api.celcoin.domain.repositories.IPixDatabaseRepository;
import org.api.celcoin.infra.panache.mappers.PanachePixMapper;
import org.api.celcoin.infra.panache.model.PanachePix;

@ApplicationScoped
public class PanachePixRepository implements IPixDatabaseRepository {

    @Override
    public PixBO persist(PixBO bo) {
        PanachePix entity = PanachePixMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanachePixMapper.toDomain(entity);
    }

}
