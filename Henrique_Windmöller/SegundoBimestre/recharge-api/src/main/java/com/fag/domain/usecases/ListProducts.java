package main.java.com.fag.domain.usecases;

import domain.dto.ProductDTO;
import domain.repositories.IRechargeVendor;

import java.util.List;

public class ListProducts {
    private IRechargeVendor vendor;

    public ListProducts(IRechargeVendor vendor) {
        this.vendor = vendor;
    }

    public List<ProductDTO> execute(Integer stateCode, Integer operatorId) {
     
    }
}
