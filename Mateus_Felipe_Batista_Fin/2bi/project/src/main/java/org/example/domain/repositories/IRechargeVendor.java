package org.example.domain.repositories;



import org.example.domain.dto.OperatorDTO;
import org.example.domain.dto.ProductDTO;
import org.example.domain.dto.RechargeDTO;

import java.util.List;

public interface IRechargeVendor {
    RechargeDTO create(RechargeDTO recharge);

    List<OperatorDTO> listOperators(Integer stateCode, Integer category);

    List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);
}
