package br.com.fag.domain.usecases;

import java.util.List;

import br.com.fag.domain.dto.OperatorDTO;
import br.com.fag.domain.repositories.IRechargeVendorRepository;

public class ListOperators {
  private IRechargeVendorRepository vendor;

  public ListOperators() {
  }

  public ListOperators(IRechargeVendorRepository vendor) {
    this.vendor = vendor;
  }

  public List<OperatorDTO> execute(Integer stateCode, Integer category){
    return null;
  }

  public IRechargeVendorRepository getVendor() {
    return this.vendor;
  }

  public void setVendor(IRechargeVendorRepository vendor) {
    this.vendor = vendor;
  }
}
