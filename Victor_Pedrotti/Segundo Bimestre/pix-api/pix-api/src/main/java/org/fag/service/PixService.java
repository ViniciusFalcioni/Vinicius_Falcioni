package org.fag.service;

import org.fag.domain.dto.PixDTO;
import org.fag.domain.repositories.IPixDataBaseRepository;
import org.fag.domain.useCases.CreatePix;
import org.fag.infra.celcoin.repositories.PixCelcoinRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {
    
    @Inject
    PixCelcoinRepository celcoinRepo;

    @Inject
    IPixDataBaseRepository panacheRepo;

    @Transactional
    public Response handlePix(PixDTO dto) {
        CreatePix createPix = new CreatePix(celcoinRepo, panacheRepo);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}
