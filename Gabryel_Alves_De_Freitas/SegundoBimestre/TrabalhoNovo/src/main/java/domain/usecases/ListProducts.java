package domain.usecases;

import java.util.List;

import domain.dto.ProductDTO;
import domain.repositories.IRechargeVendorRepository;

public class ListProducts {
    private IRechargeVendorRepository vendor;

    public ListProducts(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<ProductDTO> execute(Integer operatorId) {
        return vendor.listProducts(null, operatorId);
    }
}
