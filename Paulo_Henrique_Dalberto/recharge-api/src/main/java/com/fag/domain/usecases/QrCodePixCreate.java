package com.fag.domain.usecases;

import com.fag.domain.dto.PixQrCodeDTO;
import com.fag.domain.entities.PixQrcodeBO;
import com.fag.domain.mappers.PixQrCodeMapper;
import com.fag.domain.repositories.IPixQrCodeDataBaseRepository;
import com.fag.domain.repositories.IPixQrCodeVendor;

public class QrCodePixCreate {
    private IPixQrCodeVendor vendor;
    private IPixQrCodeDataBaseRepository repository;

    public QrCodePixCreate(IPixQrCodeVendor vendor, IPixQrCodeDataBaseRepository repository) {
        this.vendor = vendor;
        this.repository = repository;
    }

    public PixQrCodeDTO execute(PixQrCodeDTO dto) {
        PixQrcodeBO bo = PixQrCodeMapper.toBO(dto);

        PixQrCodeDTO response = vendor.create(dto);

        repository.persist(bo);

        return response;
    }
}