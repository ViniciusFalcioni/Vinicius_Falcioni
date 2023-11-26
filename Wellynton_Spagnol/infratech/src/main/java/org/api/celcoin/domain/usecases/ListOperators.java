package org.api.celcoin.domain.usecases;

import org.api.celcoin.domain.dto.OperatorDTO;
import org.api.celcoin.domain.repositories.IRechargeVendorRepository;

import java.util.List;

public class ListOperators {

    private IRechargeVendorRepository vendor;

    public ListOperators(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<OperatorDTO> execute(Integer stateCode, Integer category) {
        return (List<OperatorDTO>) vendor.listOperators(stateCode, category);
    }

}
