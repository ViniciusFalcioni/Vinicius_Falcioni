package org.example.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.example.domain.dto.PixDTO;
import org.example.domain.repositories.IPixDataBaseRepository;
import org.example.domain.usecases.CreatePixQRCode;
import org.example.infra.celcoin.repository.PixCelcoin;

@ApplicationScoped
public class PixService {

    @Inject
    PixCelcoin celcoin;

    @Inject
    IPixDataBaseRepository repository;

    @Transactional
    public Response handlePix(PixDTO dto) {
        CreatePixQRCode createPixQRCode = new CreatePixQRCode(celcoin, repository);

        PixDTO newPix = createPixQRCode.execute(dto);

        return Response.ok(newPix).build();
    }

}