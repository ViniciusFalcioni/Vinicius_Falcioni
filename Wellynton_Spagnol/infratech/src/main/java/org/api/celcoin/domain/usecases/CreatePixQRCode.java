package org.api.celcoin.domain.usecases;

import org.api.celcoin.domain.dto.PixDTO;
import org.api.celcoin.domain.entities.PixBO;
import org.api.celcoin.domain.mappers.PixMapper;
import org.api.celcoin.domain.repositories.IPixDatabaseRepository;
import org.api.celcoin.domain.repositories.IPixVendorRepository;

public class CreatePixQRCode {

    private IPixVendorRepository vendor;
    private IPixDatabaseRepository repository;

    public CreatePixQRCode(IPixVendorRepository vendor, IPixDatabaseRepository repository) {
        this.vendor = vendor;
        this.repository = repository;
    }

    public PixDTO execute(PixDTO dto) {
        PixBO bo = PixMapper.toBO(dto);

        PixDTO response = vendor.create(dto);

        repository.persist(bo);

        return response;
    }


}
