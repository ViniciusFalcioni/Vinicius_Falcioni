package org.walker.tech.pix.infra.usecasesses;

import org.walker.tech.pix.domain.dto.PixDto;
import org.walker.tech.pix.domain.entities.PixBo;
import org.walker.tech.pix.domain.mappers.PixMapper;
import org.walker.tech.pix.domain.repositories.IPixDbRepository;
import org.walker.tech.pix.domain.repositories.IPixRepository;

public class GeneratePixUseCase {
    private final IPixRepository repository;
    private final IPixDbRepository dbRepository;

    public GeneratePixUseCase(IPixRepository repository, IPixDbRepository dbRepository) {
        this.repository = repository;
        this.dbRepository = dbRepository;
    }

    public PixDto generate(PixDto pixQrCodeDTO) {
        PixDto createdPix = repository.generate(pixQrCodeDTO);
        if (createdPix != null) {
            PixBo bo = PixMapper.toBO(createdPix);
            dbRepository.persist(bo);
        }

        return createdPix;
    }
}
