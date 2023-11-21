package com.fag.domain.useCases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixDataBaseRepository;
import com.fag.domain.repositories.IPixVendor;

public class CreatePix {
    private IPixDataBaseRepository pixRepo;
    private IPixVendor pixVendor;
    public CreatePix(IPixDataBaseRepository pixRepo, IPixDataBaseRepository panache){
        this.pixRepo = pixRepo;
    }

    public PixDTO execute(PixDTO pixDTO){
        PixBO bo = PixMapper.toBO(pixDTO);
        PixDTO createdPix = pixVendor.create(pixDTO);
        pixRepo.persist(bo);

        return createdPix;
    }

    public CreatePix(IPixDataBaseRepository pixRepo, IPixVendor pixVendor) {
        this.pixRepo = pixRepo;
        this.pixVendor = pixVendor;
    }
}
