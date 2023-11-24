package br.com.fag.domain.repositories;

import java.util.List;

import br.com.fag.domain.dto.OperatorDTO;
import br.com.fag.domain.dto.ProductDTO;
import br.com.fag.domain.dto.RechargeDTO;

public interface IRechargeVendorRepository {
  RechargeDTO create(RechargeDTO recharge);

	List<OperatorDTO> listOperators(Integer stateCode, Integer category);

	List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);
}
