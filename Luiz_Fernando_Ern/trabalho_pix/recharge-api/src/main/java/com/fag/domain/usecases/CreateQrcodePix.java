package com.fag.domain.usecases;

import com.fag.domain.dto.QrcodePixDTO;
import com.fag.domain.entities.QrcodePixBO;
import com.fag.domain.mappers.QrcodePixMapper;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.domain.repositories.IQrcodePixVendor;

public class CreateQrcodePix {
    private IQrcodePixVendor vendor;
    private IPixDatabaseRepository repository;

    public CreateQrcodePix(IQrcodePixVendor vendor, IPixDatabaseRepository repository) {
        this.vendor = vendor;
        this.repository = repository;
    }

    public QrcodePixDTO execute(QrcodePixDTO dto) {
        QrcodePixBO bo = QrcodePixMapper.toBO(dto);

        QrcodePixDTO response = vendor.create(dto);

        repository.persist(bo);

        return response;
    }
}