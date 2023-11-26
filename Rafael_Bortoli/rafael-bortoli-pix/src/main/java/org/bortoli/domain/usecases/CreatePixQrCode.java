package org.bortoli.domain.usecases;

import org.bortoli.domain.dto.PixQrCodeDTO;
import org.bortoli.domain.entities.PixQrCodeBO;
import org.bortoli.domain.mappers.PixQrCodeMapper;
import org.bortoli.domain.repositories.IPixQrCodeDataBaseRepository;
import org.bortoli.domain.repositories.IPixRepository;

public class CreatePixQrCode {
    private final IPixRepository pixRepo;
    private final IPixQrCodeDataBaseRepository dataBaseRepo;

    public CreatePixQrCode(IPixRepository pixRepo, IPixQrCodeDataBaseRepository dataBaseRepo) {
        this.pixRepo = pixRepo;
        this.dataBaseRepo = dataBaseRepo;
    }

    public PixQrCodeDTO execute(PixQrCodeDTO pixQrCodeDTO) {
        PixQrCodeDTO createdPix = this.pixRepo.create(pixQrCodeDTO);
        PixQrCodeBO bo = PixQrCodeMapper.toBO(createdPix);
        this.dataBaseRepo.persist(bo);
        return createdPix;
    }
}
