package com.fag.domain.usecases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixDataBaseRepository;
import com.fag.domain.repositories.IPixVendor;

public class CreatePixQRCode {

    private IPixVendor vendor;

    private IPixDataBaseRepository dbRepository;

    public CreatePixQRCode(IPixVendor vendor, IPixDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }

    public PixDTO execute(PixDTO dto) {
        PixDTO response = vendor.create(dto);

        dbRepository.persist(PixMapper.toBO(response));

        return response;
    }

}