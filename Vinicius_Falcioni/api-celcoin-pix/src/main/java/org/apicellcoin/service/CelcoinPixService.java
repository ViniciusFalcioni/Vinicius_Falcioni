package org.apicellcoin.service;

import org.apicellcoin.domain.dto.PixCelcoinDTO;
import org.apicellcoin.domain.repositories.ICelcoinPixDataBaseRepository;
import org.apicellcoin.domain.usecases.GeneratePixQRCode;
import org.apicellcoin.infra.celcoin.usecases.PixCelcoin;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class CelcoinPixService {
    @Inject
    PixCelcoin celcoin;

    @Inject
    ICelcoinPixDataBaseRepository panacheRepo;

    @Transactional
    public Response handlePix(PixCelcoinDTO dto) {
        GeneratePixQRCode createPix = new GeneratePixQRCode(celcoin, panacheRepo);

        PixCelcoinDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}