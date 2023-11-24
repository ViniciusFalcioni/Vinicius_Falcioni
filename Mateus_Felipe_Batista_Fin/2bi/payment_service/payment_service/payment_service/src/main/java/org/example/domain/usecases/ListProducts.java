package main.java.org.example.domain.usecases;

import java.org.example.domain.dto.ProductDTO;
import java.org.example.domain.repositories.IRechargeVendor;

import java.util.List;

public class ListProducts {
    private IRechargeVendor vendor;

    public List<ProductDTO> execute (Integer operatorId) {
        return null;
    }

    public ListProducts(IRechargeVendor vendor) {
        this.vendor = vendor;
    }
}
