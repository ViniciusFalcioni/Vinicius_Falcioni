package com.fag.domain.usecases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IRechargeVendor;

public class CreateQrCode {

    private IRechargeVendor vendor;

    public CreateQrCode(IRechargeVendor vendor) {
        this.vendor = vendor;
    }

    public PixDTO execute(PixDTO dto) {
        PixBO bo = PixMapper.toBO(dto);

        PixDTO createdPixDTO = vendor.create(dto);

       // bo.updateQRCode();

        // databaserepo.persit(bo);

        return PixMapper.toDTO(bo);
    }

}