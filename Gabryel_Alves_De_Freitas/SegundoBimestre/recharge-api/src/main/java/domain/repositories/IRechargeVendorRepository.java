package domain.repositories;

import java.util.List;

import domain.dto.OperatorDTO;
import domain.dto.ProductDTO;
import domain.dto.RechargeDTO;

public interface IRechargeVendorRepository {
    RechargeDTO create(RechargeDTO recharge);

    List<OperatorDTO> listOperators(Integer stateCode, Integer category);

    List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);
}