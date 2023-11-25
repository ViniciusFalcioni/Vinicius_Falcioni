package com.fag.domain.usecases;

import com.fag.domain.dto.PixCelcoinDTO;
import com.fag.domain.entities.PixCelcoinBO;
import com.fag.domain.mappers.PixCelcoinMapper;
import com.fag.domain.repositories.PixCelcoinDataBaseRepository;
import com.fag.domain.repositories.PixCelcoinVendor;

public class PixQRCode {
    private PixCelcoinVendor vendor;
    private PixCelcoinDataBaseRepository repository;

    public PixQRCode(PixCelcoinVendor vendor, PixCelcoinDataBaseRepository repository) {
        this.vendor = vendor;
        this.repository = repository;
    }
    public PixCelcoinDTO execute(PixCelcoinDTO dto) {
        PixCelcoinBO bo = PixCelcoinMapper.toBO(dto);
        PixCelcoinDTO response = vendor.create(dto);
        repository.persist(bo);
        return response;
    }
}
