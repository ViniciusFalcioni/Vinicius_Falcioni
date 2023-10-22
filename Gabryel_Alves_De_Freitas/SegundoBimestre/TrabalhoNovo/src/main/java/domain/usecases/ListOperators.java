package domain.usecases;

import java.util.List;

import domain.dto.OperatorDTO;
import domain.repositories.IRechargeVendorRepository;

public class ListOperators {
    private IRechargeVendorRepository vendor;

    public ListOperators(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<OperatorDTO> execute() {
        return vendor.listOperators(null, null);
    }
}
