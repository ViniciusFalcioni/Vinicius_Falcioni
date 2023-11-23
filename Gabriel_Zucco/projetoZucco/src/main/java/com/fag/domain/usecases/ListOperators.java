package main.java.com.fag.domain.usecases;

import java.util.List;

import main.java.com.fag.domain.dto.OperatorDTO;
import main.java.com.fag.domain.repositories.IRechargeVendorRepository;
import main.java.com.fag.infra.celcoin.repository.RechargeCelcoin;

public class ListOperators {
    private final IRechargeVendorRepository vendor;

    public ListOperators(RechargeCelcoin celcoin) {
        this.vendor = (IRechargeVendorRepository) celcoin;
    }

    public List<OperatorDTO> execute(Integer stateCode, Integer category) {
        return vendor.listOperators(stateCode, category);
    }
}
