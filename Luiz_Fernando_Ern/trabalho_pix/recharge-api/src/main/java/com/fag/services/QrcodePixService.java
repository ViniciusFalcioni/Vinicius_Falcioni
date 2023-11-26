package com.fag.services;

import com.fag.domain.dto.QrcodePixDTO;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.domain.usecases.CreateQrcodePix;
import com.fag.infra.celcoin.usecases.CelcoinQrcodePix;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class QrcodePixService { 

    @Inject
    CelcoinQrcodePix celcoin;

    @Inject
    IPixDatabaseRepository panacheRepo;

    @Transactional
    public Response handlePix(QrcodePixDTO dto) {
        CreateQrcodePix createPix = new CreateQrcodePix(celcoin, panacheRepo);

        QrcodePixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}