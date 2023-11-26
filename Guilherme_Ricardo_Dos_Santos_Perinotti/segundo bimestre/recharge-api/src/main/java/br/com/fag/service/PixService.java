package br.com.fag.service;

import br.com.fag.domain.dto.PixDTO;
import br.com.fag.domain.repositories.IPixDatabaseRepository;
import br.com.fag.domain.usecases.CreatePixQRCode;
import br.com.fag.infra.celcoin.usecases.PixCelcoin;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {
  @Inject
  PixCelcoin celcoin;

  @Inject
  IPixDatabaseRepository panacheRepo;

  @Transactional
  public Response handlePix(PixDTO dto) {
    CreatePixQRCode createPix = new CreatePixQRCode(celcoin, panacheRepo);

    PixDTO createdPix = createPix.execute(dto);

    return Response.ok(createdPix).build();
  }
}
