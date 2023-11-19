package main.java.com.fag.domain.usecases;

import java.util.List;

import main.java.com.fag.domain.dto.ProductDTO;
import main.java.com.fag.domain.repositories.IRechargeVendor;

public class ListOperatorServices {
    private IRechargeVendor vendor;

    public ListOperatorServices(IRechargeVendor vendor) {
        this.vendor = vendor;
    }

    public List<ProductDTO> execute(Integer stateCode, Integer operatorId) {
     return vendor.listProducts(stateCode, operatorId);
    }
}
