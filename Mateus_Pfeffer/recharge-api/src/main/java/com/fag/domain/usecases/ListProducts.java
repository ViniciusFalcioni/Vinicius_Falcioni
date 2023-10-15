package com.fag.domain.usecases;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositories.IRechargeVendorRepository;

import java.util.List;

public class ListProducts implements IRechargeVendorRepository {

    public ListProducts() {
    }

    public List<ProductDTO> execute(Integer operatorId) {
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
