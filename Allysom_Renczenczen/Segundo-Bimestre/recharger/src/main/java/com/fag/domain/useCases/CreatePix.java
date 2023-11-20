package com.fag.domain.useCases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixRepository;
import com.fag.domain.repositories.IPixVendor;

public class CreatePix {
    private IPixRepository pixRepo;
    private IPixVendor pixVendor;
    public CreatePix(IPixRepository pixRepo, IPixRepository panache){
        this.pixRepo = pixRepo;
    }

    public PixDTO execute(PixDTO pixDTO){
        PixBO bo = PixMapper.toBO(pixDTO);
        PixDTO createdPix = pixVendor.create(pixDTO);
        pixRepo.persist(bo);

        return createdPix;
    }

}
