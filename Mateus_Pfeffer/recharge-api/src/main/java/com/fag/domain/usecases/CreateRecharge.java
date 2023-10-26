package com.fag.domain.usecases;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.RechargeBO;
import com.fag.domain.repositories.IRechargeDataBaseRepository;
import com.fag.domain.repositories.IRechargeVendor;

import java.util.List;

public class CreateRecharge {

    private IRechargeVendor vendor;
    private IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(IRechargeVendor vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }

    public RechargeDTO execute(RechargeDTO dto) {
        return null;
    }

}
