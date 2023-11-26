package org.example.domain.usecases;


import org.example.domain.dto.OperatorDTO;
import org.example.domain.repositories.IRechargeVendor;

import java.util.List;

public class ListOperators {
    private IRechargeVendor vendor;

    public List<OperatorDTO> execute(Integer statateCode,Integer category) {
        return null;
    }

    public ListOperators(IRechargeVendor vendor) {
        this.vendor = vendor;
    }
}
