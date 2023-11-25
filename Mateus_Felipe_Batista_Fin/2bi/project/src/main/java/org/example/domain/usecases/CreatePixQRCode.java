package org.example.domain.usecases;

import org.example.domain.dto.PixDTO;
import org.example.domain.entities.PixBO;
import org.example.domain.mappers.PixMapper;
import org.example.domain.repositories.IPixDataBaseRepository;
import org.example.domain.repositories.IPixVendor;

public class CreatePixQRCode {
    private IPixVendor vendor;

    private IPixDataBaseRepository dbRepository;

    public CreatePixQRCode(IPixVendor vendor, IPixDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }

    public PixDTO execute(PixDTO dto) {
        PixDTO response = vendor.create(dto);
        PixBO responseBO = PixMapper.toBO(response);

        dbRepository.persist(responseBO);

        return response;
    }
}
