package com.fag.domain.usecases;

import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.RechargeBO;
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
        RechargeBO bo = RechargeMapper.toBO(dto);

        RechargeDTO response = vendor.create(dto);

        if (response.success()) {
            bo = bo.handleSuccess(response.receipt(), response.transactionId());
        } else {
            bo = bo.handleError();
        }

        dbRepository.persist(bo);

        return response;
    }

}
