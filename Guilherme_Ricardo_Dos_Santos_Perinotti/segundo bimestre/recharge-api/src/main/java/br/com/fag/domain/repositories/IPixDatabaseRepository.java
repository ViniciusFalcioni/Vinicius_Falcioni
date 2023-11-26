package br.com.fag.domain.repositories;

import br.com.fag.domain.entities.PixBO;

public interface IPixDatabaseRepository {

  PixBO persist(PixBO pixDTO);
  
}
