package br.com.fag.domain.usecases;

import java.util.List;

import br.com.fag.domain.dto.ProductDTO;
import br.com.fag.domain.repositories.IRechargeVendorRepository;

public class ListProducts {
  private IRechargeVendorRepository vendor;

  public ListProducts() {
  }

  public ListProducts(IRechargeVendorRepository vendor) {
    this.vendor = vendor;
  }

  public List<ProductDTO> execute(Integer operatorId, Integer stateCode) {
    return vendor.listProducts(stateCode, operatorId);
  }

  public IRechargeVendorRepository getVendor() {
    return this.vendor;
  }

  public void setVendor(IRechargeVendorRepository vendor) {
    this.vendor = vendor;
  }
  
}
