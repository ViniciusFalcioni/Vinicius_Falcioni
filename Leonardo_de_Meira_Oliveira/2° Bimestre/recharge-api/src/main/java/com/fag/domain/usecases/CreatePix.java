package com.fag.domain.usecases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixDataBaseRepository;
import com.fag.domain.repositories.IPixVendor;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class CreatePix {

    private IPixVendor vendor;
    private IPixDataBaseRepository dbRepository;

    public PixDTO execute(PixDTO dto) {
        PixBO bo = PixMapper.toBO((dto));
        PixDTO response = vendor.create(dto);

        dbRepository.persist(bo);

        return response;
    }

}