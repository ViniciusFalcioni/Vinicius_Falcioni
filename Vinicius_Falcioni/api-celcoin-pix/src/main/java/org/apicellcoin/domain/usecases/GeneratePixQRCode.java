package org.apicellcoin.domain.usecases;

import org.apicellcoin.domain.dto.PixCelcoinDTO;
import org.apicellcoin.domain.entities.CelcoinPixBO;
import org.apicellcoin.domain.mappers.CelcoinPixMapper;
import org.apicellcoin.domain.repositories.ICelcoinPixVendor;
import org.apicellcoin.domain.repositories.ICelcoinPixDataBaseRepository;

public class GeneratePixQRCode {
    private ICelcoinPixVendor vendor;
    private ICelcoinPixDataBaseRepository repository;

    public GeneratePixQRCode(ICelcoinPixVendor vendor, ICelcoinPixDataBaseRepository repository) {
        this.vendor = vendor;
        this.repository = repository;
    }

    public PixCelcoinDTO execute(PixCelcoinDTO dto) {
        CelcoinPixBO bo = CelcoinPixMapper.toBO(dto);

        PixCelcoinDTO response = vendor.create(dto);

        repository.persist(bo);

        return response;
    }
}