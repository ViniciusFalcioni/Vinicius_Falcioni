package br.com.fag.domain.usecases;

import java.util.List;

import br.com.fag.domain.dto.ProductDTO;
import br.com.fag.domain.repositories.IRechargeVendorRepository;

public class ListProducts {
  private IRechargeVendorRepository vendor;

  public ListProducts() {
  }

  public List<ProductDTO> execute(Integer operatorId) {
    return null;
  }
  
}
