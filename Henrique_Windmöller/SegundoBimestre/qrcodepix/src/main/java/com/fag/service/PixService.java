package com.fag.service;

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
