package org.apicellcoin.infra.panache.repository;

import org.apicellcoin.domain.entities.CelcoinPixBO;
import org.apicellcoin.domain.repositories.ICelcoinPixDataBaseRepository;
import org.apicellcoin.infra.panache.mappers.PanachePixMapper;
import org.apicellcoin.infra.panache.model.PanachePixCode;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanachePixRepository implements ICelcoinPixDataBaseRepository {

    @Override
    public CelcoinPixBO persist(CelcoinPixBO bo) {
        PanachePixCode entity = PanachePixMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanachePixMapper.toDomain(entity);
    }

}