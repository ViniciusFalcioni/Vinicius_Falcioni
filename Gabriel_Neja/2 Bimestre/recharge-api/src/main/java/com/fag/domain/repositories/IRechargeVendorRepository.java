package com.fag.domain.repositories;

import java.util.List;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;

public interface IRechargeVendorRepository {
     RechargeDTO create(RechargeDTO recharge);

     public List<OperatorDTO> listOperators(Integer stateCode, Integer category);

     public List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);
              
}

