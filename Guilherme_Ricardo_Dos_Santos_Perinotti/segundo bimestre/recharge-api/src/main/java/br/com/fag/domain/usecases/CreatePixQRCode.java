package br.com.fag.domain.usecases;

import br.com.fag.domain.dto.PixDTO;
import br.com.fag.domain.entities.PixBO;
import br.com.fag.domain.mappers.PixMapper;
import br.com.fag.domain.repositories.IPixDatabaseRepository;
import br.com.fag.domain.repositories.IPixVendor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreatePixQRCode {
  private IPixVendor vendor;
  private IPixDatabaseRepository repository;

  public PixDTO execute(PixDTO dto) {
    PixBO bo = PixMapper.toBO(dto);

    PixDTO response = vendor.create(dto);

    repository.persist(bo);

    return response;
  }
}
