package com.fag.infra.panache.repository;

import com.fag.domain.entities.PixCelcoinBO;
import com.fag.domain.repositories.PixCelcoinDataBaseRepository;
import com.fag.infra.panache.mappers.PanachePixMapper;
import com.fag.infra.panache.model.PanachePixCode;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanachePixRepository implements PixCelcoinDataBaseRepository {
    
    @Override
    public PixCelcoinBO persist(PixCelcoinBO bo) {
        PanachePixCode entity = PanachePixMapper.toEntity(bo);
        entity.persistAndFlush();
        return PanachePixMapper.toDomain(entity);
    }
}
