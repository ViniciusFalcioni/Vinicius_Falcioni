package com.fag.domain.usecases;

import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.mappers.RechargeMapper;
import com.fag.domain.repositories.IRechargeDataBaseRepository;
import com.fag.domain.repositories.IRechargeVendor;

public class CreateRecharge {

    private IRechargeVendor vendor;
    private IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(IRechargeVendor vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }

    public RechargeDTO execute(RechargeDTO dto) {
        return RechargeMapper.toDTO(dbRepository.persist(RechargeMapper.toBO(dto)));
    }

}
