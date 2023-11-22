package com.fag.service;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.usecases.CreatePix;
import com.fag.infra.celcoin.repositories.PixCelcoin;
import com.fag.infra.panache.repositories.PanachePixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {
  @Inject
  PixCelcoin celcoin;

  @Inject
  PanachePixRepository panacheRepository;

  @Transactional
  public Response handlePix(PixDTO dto) {
    CreatePix createPix = new CreatePix(celcoin, panacheRepository);

    PixDTO createdPix = createPix.execute(dto);

    return Response.ok(createdPix).build();
  }
}