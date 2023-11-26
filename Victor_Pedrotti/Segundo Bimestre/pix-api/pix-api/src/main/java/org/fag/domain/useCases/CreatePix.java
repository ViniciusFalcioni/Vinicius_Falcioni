package org.fag.domain.useCases;

import org.fag.domain.dto.PixDTO;
import org.fag.domain.entities.PixBO;


import org.fag.domain.mappers.PixMapper;
import org.fag.domain.repositories.IPixDataBaseRepository;
import org.fag.domain.repositories.IPixRepository;

public class CreatePix {
    
    private IPixRepository pixRepo;
    private IPixDataBaseRepository pixDbRepo;

    public CreatePix(IPixRepository pixRepo, IPixDataBaseRepository pixDbRepo){
        this.pixRepo = pixRepo;
        this.pixDbRepo = pixDbRepo;
    }

    public PixDTO execute(PixDTO dto){

        PixBO bo = PixMapper.toBO(dto);

        PixDTO response = pixRepo.create(dto);

        pixDbRepo.persist(bo);

        return response;
    }
}
