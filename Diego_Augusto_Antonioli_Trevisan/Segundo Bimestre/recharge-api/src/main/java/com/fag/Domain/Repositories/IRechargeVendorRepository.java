package com.fag.Domain.Repositories;

import java.util.List;

import com.fag.Domain.DTO.OperatorDTO;
import com.fag.Domain.DTO.ProductDTO;
import com.fag.Domain.DTO.RechargeDTO;

public interface IRechargeVendorRepository {
    RechargeDTO create(RechargeDTO recharge);

    List<OperatorDTO> listOperators(Integer stateCode, Integer category);

    List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);
}
