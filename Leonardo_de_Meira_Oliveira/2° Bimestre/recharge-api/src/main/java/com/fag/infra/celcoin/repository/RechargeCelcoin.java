package com.fag.infra.celcoin.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositories.IRechargeVendorRepository;
import com.fag.infra.celcoin.dto.CelcoinOperatorDTO;
import com.fag.infra.celcoin.dto.CelcoinRechargeDTO;
import com.fag.infra.celcoin.dto.CelcoinRechargeResponseDTO;
import com.fag.infra.celcoin.mappers.CelcoinOperatorMapper;
import com.fag.infra.celcoin.mappers.CelcoinRechargeMapper;

import jakarta.inject.Inject;

public class RechargeCelcoin implements IRechargeVendorRepository {
    @Inject
    @RestClient
    RestClientCelcoin restClient;

    @Override
    public RechargeDTO create(RechargeDTO recharge) {
        try {
            CelcoinRechargeDTO rechargeDTO = CelcoinRechargeMapper.toVendorDTO(recharge);
            
            CelcoinRechargeResponseDTO response = restClient.handleRecharge(getToken(), rechargeDTO);

            recharge.setReceipt(response.getReceipt().getReceiptData());
            recharge.setTransactionId((response.getTransactionId()));
            recharge.setSuccess(response.getErrorCode().equals("000"));
        } catch (Exception e) {
            throw new RuntimeException("Erro comunicação provedor servico recarga.");
        }
    }

    @Override
    public List<OperatorDTO> listOperators(Integer stateCode, Integer category) {
        try {
            CelcoinOperatorDTO operators = restClient.listOperators(getToken(), stateCode, category);

            return operators.getProviders().stream().map(operator -> CelcoinOperatorMapper.toAppDTO(operators)).collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Erro comunicação provador serviço recarga.", e);
        }
    }

    @Override
    public List<ProductDTO> listProducts(Integer stateCode, Integer operatorId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listProducts'");
    }
    
}
