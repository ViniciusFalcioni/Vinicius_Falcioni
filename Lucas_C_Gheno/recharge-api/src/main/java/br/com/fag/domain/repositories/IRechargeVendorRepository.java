package br.com.fag.domain.repositories;

import java.util.List;

import br.com.fag.domain.dto.CCoinOperatorDTO;
import br.com.fag.domain.dto.CCoinProductDTO;
import br.com.fag.domain.dto.CCoinRechargeDTO;

public interface IRechargeVendorRepository {
    CCoinRechargeDTO create(CCoinRechargeDTO recharge);

    List<CCoinOperatorDTO> listOperators(Integer stateCode, Integer category);

    List<CCoinProductDTO> listProducts(Integer stateCode, Integer operatorId);
}