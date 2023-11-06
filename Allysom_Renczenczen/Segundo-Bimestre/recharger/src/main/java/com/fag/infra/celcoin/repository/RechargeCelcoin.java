package com.fag.infra.celcoin.repository;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositories.IRechargeVendor;
import com.fag.infra.celcoin.dto.*;
import com.fag.infra.celcoin.mappers.CelcoinOperatorMapper;
import com.fag.infra.celcoin.mappers.CelcoinProductMapper;
import com.fag.infra.celcoin.mappers.CelcoinRechargeMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class RechargeCelcoin implements IRechargeVendor {
    @Inject
    @RestClient
    RestClientCelcoin restClient;

    @Override
    public RechargeDTO create(RechargeDTO recharge){
        try {
            CelcoinRechargeDTO rechargeDTO = CelcoinRechargeMapper.toVendorDTO(recharge);
            CelcoinRechargeResponseDTO response = restClient.handleRecharge(getToken(), rechargeDTO);
            recharge.setReceipt(response.getReceipt().getReceiptData());
            recharge.setTransactionId(response.getTransactionId());
            recharge.setSuccess(response.getErrorCode().equals("000"));
        }catch (Exception e){
            throw new RuntimeException("Erro de comunicação com o provedor de serviço de recarga!");
        }
        return recharge;
    }

    @Override
    public List<OperatorDTO> listOperators(Integer stateCode, Integer category) {
        try{
            CelcoinOperatorsDTO operators= restClient.listOperators(getToken(), stateCode, category);
            return  operators.getProviders().stream()
                    .map(CelcoinOperatorMapper::toAppDTO)
                    .collect(Collectors.toList());
        }catch (Exception e){
            throw new RuntimeException("Erro de comunicação com o provedor de serviço de recarga!", e);
        }
    }
    @Override
    public List<ProductDTO> listProducts(Integer operatorId, Integer stateCode) {
        try{
            CelcoinProductsDTO products = restClient.listProducts(getToken(), stateCode, operatorId);
            return products.getProducts().stream()
                    .map(CelcoinProductMapper::toAppDTO)
                    .collect(Collectors.toList());
        }catch (Exception e) {
            throw new RuntimeException("Erro de comunicação com o provedor de serviço de recarga!", e);
        }
    }

    private String getToken() {
        Form form = new Form();

        CelcoinTokenDTO tokenDTO = restClient.generateToken(form);
        return "Bearer " + tokenDTO.getAccessToken();
    }

}
