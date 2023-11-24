package main.java.org.example.domain.repositories;



import main.java.org.example.domain.dto.OperatorDTO;
import main.java.org.example.domain.dto.ProductDTO;
import main.java.org.example.domain.dto.RechargeDTO;

import java.util.List;

public interface IRechargeVendor {
    RechargeDTO create(RechargeDTO recharge);

    List<OperatorDTO> listOperators(Integer stateCode, Integer category);

    List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);
}
