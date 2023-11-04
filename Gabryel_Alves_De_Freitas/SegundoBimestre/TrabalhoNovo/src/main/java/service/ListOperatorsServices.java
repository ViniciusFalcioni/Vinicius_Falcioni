package service;

import java.util.List;

import domain.dto.ProductDTO;
import domain.repositories.IRechargeVendorRepository;

public class ListOperatorsServices {
    private IRechargeVendorRepository vendor;

    public ListOperatorsServices(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<ProductDTO> execute(Integer stateCode, Integer operatorId) {
        return null;
    }
    
}
