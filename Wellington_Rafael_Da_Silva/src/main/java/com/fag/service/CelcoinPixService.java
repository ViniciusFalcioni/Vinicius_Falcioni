package com.fag.service;


import com.fag.domain.dto.PixCelcoinDTO;
import com.fag.domain.repositories.PixCelcoinDataBaseRepository;
import com.fag.domain.usecases.PixQRCode;
import com.fag.infra.celcoin.usecases.PixCelcoin;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
@ApplicationScoped
public class CelcoinPixService {
    @Inject
    PixCelcoin celcoin;
    @Inject
    PixCelcoinDataBaseRepository panacheRepo;
    
    @Transactional
    public Response handlePix(PixCelcoinDTO dto) {
        PixQRCode createPix = new PixQRCode(celcoin, panacheRepo);
        PixCelcoinDTO createdPix = createPix.execute(dto);
        return Response.ok(createdPix).build();
    }
}