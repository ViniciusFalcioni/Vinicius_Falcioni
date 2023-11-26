package org.example.infra.panache.repository;


import jakarta.enterprise.context.ApplicationScoped;
import org.example.domain.entities.PixBO;
import org.example.domain.repositories.IPixDataBaseRepository;
import org.example.infra.panache.mappers.PanachePixMapper;
import org.example.infra.panache.model.PanachePixCode;

@ApplicationScoped
public class PanachePixRepository implements IPixDataBaseRepository {

    @Override
    public PixBO persist(PixBO bo) {
        PanachePixCode entity = PanachePixMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanachePixMapper.toDomain(entity);
    }

}