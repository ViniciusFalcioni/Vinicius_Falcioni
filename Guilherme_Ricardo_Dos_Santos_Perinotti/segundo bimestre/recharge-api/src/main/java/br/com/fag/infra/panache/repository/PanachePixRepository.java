package br.com.fag.infra.panache.repository;

import br.com.fag.domain.entities.PixBO;
import br.com.fag.domain.repositories.IPixDatabaseRepository;
import br.com.fag.infra.panache.mappers.PanachePixMapper;
import br.com.fag.infra.panache.model.PanachePixCode;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanachePixRepository implements IPixDatabaseRepository {

  @Override
  public PixBO persist(PixBO bo) {
    PanachePixCode entity = PanachePixMapper.toEntity(bo);

    entity.persistAndFlush();

    return PanachePixMapper.toDomain(entity);
  }

}
