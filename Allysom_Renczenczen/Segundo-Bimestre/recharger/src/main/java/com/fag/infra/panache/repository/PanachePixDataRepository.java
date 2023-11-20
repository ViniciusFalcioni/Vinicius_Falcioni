package com.fag.infra.panache.repository;


import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.repositories.IPixRepository;
import com.fag.infra.panache.mappers.PanachePixMapper;
import com.fag.infra.panache.models.PanachePix;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanachePixDataRepository implements IPixRepository {

    @Override
    public PixBO persist(PixBO bo){
        PanachePix entity = PanachePixMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanachePixMapper.toDomain(entity);
    }

}
