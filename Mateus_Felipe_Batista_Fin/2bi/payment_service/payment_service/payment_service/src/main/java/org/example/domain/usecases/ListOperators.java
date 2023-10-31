package org.example.domain.usecases;

import org.example.domain.dto.OperatorDTO;
import org.example.domain.repositories.IRechargeVendorRepository;

import java.util.List;

public class ListOperators {
    private IRechargeVendorRepository vendor;

    public List<OperatorDTO> execute() {
        return null;
    }

    public ListOperators(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }
}
