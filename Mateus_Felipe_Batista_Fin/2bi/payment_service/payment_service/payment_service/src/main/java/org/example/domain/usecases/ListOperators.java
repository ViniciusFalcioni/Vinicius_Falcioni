package main.java.org.example.domain.usecases;

import java.org.example.domain.dto.OperatorDTO;
import java.org.example.domain.repositories.IRechargeVendor;

import java.util.List;

public class ListOperators {
    private IRechargeVendor vendor;

    public List<OperatorDTO> execute() {
        return null;
    }

    public ListOperators(IRechargeVendor vendor) {
        this.vendor = vendor;
    }
}
