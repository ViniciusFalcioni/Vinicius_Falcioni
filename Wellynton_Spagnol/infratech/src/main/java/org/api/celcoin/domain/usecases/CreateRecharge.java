package org.api.celcoin.domain.usecases;

import org.api.celcoin.domain.dto.RechargeDTO;
import org.api.celcoin.domain.entities.RechargeBO;
import org.api.celcoin.domain.mappers.RechargeMapper;
import org.api.celcoin.domain.repositories.IRechargeDataBaseRepository;
import org.api.celcoin.domain.repositories.IRechargeVendorRepository;

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

        if (rechargeResponse.isSuccess()) {
            bo.handleSuccess(rechargeResponse.getReceipt(), rechargeResponse.getTransactionId());
        } else {
            bo.handleError();
        }

        dbRepository.persist(bo);

        return rechargeResponse;
    }

}
