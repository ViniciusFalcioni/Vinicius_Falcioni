package com.fag.Domain.UseCases;


import com.fag.Domain.DTO.RechargeDTO;
import com.fag.Domain.Entities.RechargeBO;
import com.fag.Domain.Mappers.RechargeMapper;
import com.fag.Domain.Repositories.IRechargeDataBaseRepository;
import com.fag.Domain.Repositories.IRechargeVendorRepository;

public class CreateRecharge {
    private IRechargeVendorRepository vendor;
    private IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(IRechargeVendorRepository vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }

    public RechargeDTO execute(RechargeDTO dto) {
        RechargeBO bo = RechargeMapper.toBO(dto);

        RechargeDTO rechargeResponse = vendor.create(dto);

        if (rechargeResponse.getSuccess()) {
            bo.handleSuccess(rechargeResponse.getReceipt(), rechargeResponse.getTransactionId());
        } else {
            bo.handleError();
        }

        dbRepository.persist(bo);

        return rechargeResponse;
    }
}