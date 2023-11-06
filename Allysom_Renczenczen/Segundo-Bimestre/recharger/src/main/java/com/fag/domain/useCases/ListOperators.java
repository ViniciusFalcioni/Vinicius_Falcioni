package com.fag.domain.useCases;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.repositories.IRechargeVendor;
import com.fag.infra.celcoin.repository.RechargeCelcoin;

import java.util.List;

public class ListOperators {
    private IRechargeVendor vendor;

    public ListOperators(IRechargeVendor vendor) {
        this.vendor = vendor;
    }

    public List<OperatorDTO> execute(Integer stateCode, Integer category) {
        return vendor.listOperators(stateCode, category);
    }
}
