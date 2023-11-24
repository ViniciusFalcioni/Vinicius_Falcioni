package com.fag.domain.usecases;

import java.util.List;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.repositories.IRechargeVendorRepository;

public class ListOperators {
        private IRechargeVendorRepository vendor;

    public ListOperators(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    // public List<OperatorDTO> execute() {
    //     // Implemente a lógica para listar operadores usando o IRechargeVendor.
    //     // Exemplo hipotético:
    //     List<OperatorDTO> operators = vendor.listOperators(stateCode, category);
    //     return operators;
    // }
}
