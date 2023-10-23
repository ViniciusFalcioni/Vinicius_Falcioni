package com.fag.Domain.UseCases;

import java.util.List;

import com.fag.Domain.DTO.OperatorDTO;
import com.fag.Domain.Repositories.IRechargeVendorRepository;

public class ListOperators {
    private IRechargeVendorRepository vendor;

    public ListOperators(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<OperatorDTO> execute(){

        return vendor.listOperators(null, null)
    }
}
