package com.fag.Domain.UseCases;

import java.util.UUID;

import com.fag.Domain.DTO.RechargeDTO;
import com.fag.Domain.Entities.RechargeBO;
import com.fag.Domain.Mappers.PhoneMapper;
import com.fag.Domain.Repositories.IRechargeDataBaseRepository;
import com.fag.Domain.Repositories.IRechargeVendorRepository;

public class CreateRecharge {
    private IRechargeVendorRepository vendor;
    private IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(IRechargeVendorRepository vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }

    public RechargeDTO execute(RechargeDTO rechargeDTO) {
        RechargeDTO resultDTO = vendor.create(rechargeDTO);

        RechargeBO rechargeBO = mapToRechargeBO(resultDTO);
        dbRepository.persist(rechargeBO);

        return resultDTO;
    }

    private RechargeBO mapToRechargeBO(RechargeDTO rechargeDTO) {

        return new RechargeBO(UUID.fromString(rechargeDTO.getId()),
                rechargeDTO.getValue(),
                rechargeDTO.getDocument(),
                rechargeDTO.getOperatorID(),
                PhoneMapper.toBO(rechargeDTO.getPhone()),
                rechargeDTO.getReceipt(),
                rechargeDTO.getTransactionId(), rechargeDTO.getSuccess());
    }
}
