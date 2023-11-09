package com.fag.Domain.UseCases;

import java.util.List;

import com.fag.Domain.DTO.OperatorDTO;
import com.fag.Domain.Repositories.IRechargeVendorRepository;

public class ListOperators {
    private IRechargeVendorRepository vendor;

    public ListOperators(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<OperatorDTO> execute(Integer stateCode, Integer category){

        return vendor.listOperators(stateCode, category);
    }
}
