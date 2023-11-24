package com.fag.infra.panache.repository;

import com.fag.domain.repositories.IPixQrCodeDataBaseRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import com.fag.infra.panache.mappers.PanachePixQrCodeMapper;
import com.fag.infra.panache.model.PanachePixQrCode;
import com.fag.domain.entities.PixQrcodeBO;

@ApplicationScoped
public class PanachePixQrCodeDataBaseRepository implements IPixQrCodeDataBaseRepository {

  @Override
  @Transactional
  public PixQrcodeBO persist(PixQrcodeBO bo) {
    PanachePixQrCode entity = PanachePixQrCodeMapper.toEntity(bo);

    entity.persistAndFlush();
    
    return PanachePixQrCodeMapper.toDomain(entity);
  }
}