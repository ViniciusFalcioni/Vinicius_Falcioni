package com.fag.service;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.repositories.IPixDataBaseRepository;
import com.fag.domain.useCases.CreatePix;
import com.fag.infra.celcoin.usecases.PixCelcoin;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {
    @Inject
    PixCelcoin pixCelcoin;
    @Inject
    IPixDataBaseRepository panache;

    @Transactional
    public Response handlePix(PixDTO dto){
        CreatePix createPix = new CreatePix(pixCelcoin, panache);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }

}

