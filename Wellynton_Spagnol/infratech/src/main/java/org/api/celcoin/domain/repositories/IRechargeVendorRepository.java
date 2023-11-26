package org.api.celcoin.domain.repositories;

import org.api.celcoin.domain.dto.OperatorDTO;
import org.api.celcoin.domain.dto.ProductDTO;
import org.api.celcoin.domain.dto.RechargeDTO;

import java.util.List;

public interface IRechargeVendorRepository {

    RechargeDTO create(RechargeDTO recharge);

    List<OperatorDTO> listOperators(Integer stateCode, Integer category);

    List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);

}
