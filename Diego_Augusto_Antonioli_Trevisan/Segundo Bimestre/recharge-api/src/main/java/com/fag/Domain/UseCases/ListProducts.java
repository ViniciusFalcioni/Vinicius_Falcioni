package com.fag.Domain.UseCases;

import java.util.List;

import com.fag.Domain.DTO.ProductDTO;
import com.fag.Domain.Repositories.IRechargeVendorRepository;

public class ListProducts {
    private IRechargeVendorRepository vendor;

    public ListProducts(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<ProductDTO> execute(Integer operatorId) {
        return vendor.listProducts(null, operatorId);
    }
}
