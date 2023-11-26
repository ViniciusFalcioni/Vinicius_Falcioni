package com.fag.infra.panache.repository;

import com.fag.domain.entities.QrcodePixBO;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.infra.panache.mappers.PanacheQrcodePixMapper;
import com.fag.infra.panache.model.PanacheQrcodePix;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PanacheQrcodePixDataBaseRepository implements IPixDatabaseRepository {

    @Override
    @Transactional
    public QrcodePixBO persist(QrcodePixBO bo) {
        PanacheQrcodePix entity = PanacheQrcodePixMapper.toEntity(bo);
        entity.persistAndFlush();
        return PanacheQrcodePixMapper.toDomain(entity);
    }
}