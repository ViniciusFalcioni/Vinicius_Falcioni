package main.java.com.fag.domain.usecases;

import domain.dto.OperatorDTO;
import domain.repositories.IRechargeVendor;

import java.util.List;

public class ListOperators {
    private IRechargeVendor vendor;

    public ListOperators(IRechargeVendor vendor) {
        this.vendor = vendor;
    }

    public List<OperatorDTO> execute(Integer stateCode, Integer category) {
    
    }
}
