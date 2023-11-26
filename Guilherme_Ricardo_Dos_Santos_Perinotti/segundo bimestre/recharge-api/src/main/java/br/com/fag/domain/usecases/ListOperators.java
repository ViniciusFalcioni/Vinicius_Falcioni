package br.com.fag.domain.usecases;

import java.util.List;

import br.com.fag.domain.dto.OperatorDTO;
import br.com.fag.domain.repositories.IRechargeVendor;

public class ListOperators {

  private IRechargeVendor vendor;

  public ListOperators(IRechargeVendor vendor) {
    this.vendor = vendor;
  }

  public List<OperatorDTO> execute(Integer stateCode, Integer category) {
    return vendor.listOperators(stateCode, category);
  }

}
