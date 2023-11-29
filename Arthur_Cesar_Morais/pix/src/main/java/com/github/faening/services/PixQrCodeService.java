package com.github.faening.services;

import com.github.faening.domain.dto.PixQrCodeDTO;
import com.github.faening.domain.usecases.CreatePixQrCodeUC;

import com.github.faening.infra.celcoin.repository.CelcoinPixRepository;
import com.github.faening.infra.panache.repositories.PanachePixPersistRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PixQrCodeService {
    @Inject
    CelcoinPixRepository celcoinPixRepository;

    @Inject
    PanachePixPersistRepository panachePixPersistRepository;

    public PixQrCodeDTO generatePixStaticQrCode(PixQrCodeDTO pixQrCodeDTO) {
        CreatePixQrCodeUC createPixQrCodeUC = new CreatePixQrCodeUC(celcoinPixRepository, panachePixPersistRepository);
        return createPixQrCodeUC.execute(pixQrCodeDTO);
    }
}
