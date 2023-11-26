package org.bortoli.service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bortoli.domain.dto.PixQrCodeDTO;
import org.bortoli.domain.usecases.CreatePixQrCode;
import org.bortoli.infra.celcoin.repositories.CcPixRepository;
import org.bortoli.infra.panache.PanacheDataBaseRepository;

@ApplicationScoped
public class PixQrCodeService {
    @Inject
    CcPixRepository ccPixRepository;
    @Inject
    PanacheDataBaseRepository panacheDataBaseRepository;

    public PixQrCodeDTO genPix(PixQrCodeDTO dto) {
        CreatePixQrCode createPixQrCode = new CreatePixQrCode(this.ccPixRepository, this.panacheDataBaseRepository);
        return createPixQrCode.execute(dto);
    }
}
