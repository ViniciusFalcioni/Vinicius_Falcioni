package com.fag.domain.usecases;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.RechargeBO;
import com.fag.domain.repositories.IRechargeDataBaseRepository;
import com.fag.domain.repositories.IRechargeVendorRepository;

import java.util.List;

public class CreateRecharge implements IRechargeVendorRepository, IRechargeDataBaseRepository {

    public CreateRecharge() {
    }

    public RechargeDTO execute(RechargeDTO dto) {
        return null;
    }

    @Override
    public RechargeBO persist(RechargeBO bo) {
        return null;
    }

    @Override
    public RechargeDTO create(RechargeDTO recharge) {
        return null;
    }

    @Override
    public List<OperatorDTO> listOperators(Integer stateCode, Integer category) {
        return null;
    }

    @Override
    public List<ProductDTO> listProducts(Integer stateCode, Integer operatorId) {
        return null;
    }

}
