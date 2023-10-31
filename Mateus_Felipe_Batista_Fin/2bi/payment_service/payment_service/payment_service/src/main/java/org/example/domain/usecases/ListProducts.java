package org.example.domain.usecases;

import org.example.domain.dto.ProductDTO;
import org.example.domain.repositories.IRechargeVendorRepository;

import java.util.List;

public class ListProducts {
    private IRechargeVendorRepository vendor;

    public List<ProductDTO> execute (Integer operatorId) {
        return null;
    }

    public ListProducts(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }
}
