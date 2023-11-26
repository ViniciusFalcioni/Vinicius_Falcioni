package org.fag.trab.domain.usecases;


import org.fag.trab.domain.dto.PixDto;
import org.fag.trab.domain.entities.PixBo;
import org.fag.trab.domain.mappers.PixMapper;
import org.fag.trab.domain.repositories.IPixDbRepository;
import org.fag.trab.domain.repositories.IPixRepository;

public class GeneratePixUseCase {
    private final IPixRepository repository;
    private final IPixDbRepository dbRepository;

    public GeneratePixUseCase(IPixRepository repository, IPixDbRepository dbRepository) {
        this.repository = repository;
        this.dbRepository = dbRepository;
    }

    public PixDto generate(PixDto pixQrCodeDTO) {
        PixDto createdPix = repository.generate(pixQrCodeDTO);
        PixBo bo = PixMapper.toBO(createdPix);

        dbRepository.persist(bo);

        return createdPix;
    }
}
