package com.fag.infra.celcoin.repository;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositories.IRechargeVendor;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class RechargeCelcoin implements IRechargeVendor {

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
