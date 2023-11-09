package com.fag.Infra.Celcoin.Repository;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.Domain.DTO.OperatorDTO;
import com.fag.Domain.DTO.ProductDTO;
import com.fag.Domain.DTO.RechargeDTO;
import com.fag.Domain.Repositories.IRechargeVendorRepository;
import com.fag.Infra.Celcoin.DTO.CelcoinOperatorsDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinProductsDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinRechargeDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinRechargeResponseDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinTokenDTO;
import com.fag.Infra.Celcoin.Mappers.CelcoinOperatorMapper;
import com.fag.Infra.Celcoin.Mappers.CelcoinRechargeMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;

@ApplicationScoped
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
            recharge.setTransactionId(response.getTransactionId());
            recharge.setSuccess(response.getErrorCode().equals("000"));
        } catch (Exception e) {
            // Log
            throw new RuntimeException("Erro comunicação provedor serviço recarga.");
        }

        return recharge;
    }

    @Override
    public List<OperatorDTO> listOperators(Integer stateCode, Integer category) {
        try {
            CelcoinOperatorsDTO operators = restClient.listOperators(getToken(), stateCode, category);

            return operators.getProviders().stream()
                    .map(operator -> CelcoinOperatorMapper.toAppDTO(operator))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            // Log
            throw new RuntimeException("Erro comunicação provedor serviço recarga.", e);
        }
    }

    @Override
    public List<ProductDTO> listProducts(Integer operatorId, Integer stateCode) {
        try {
            CelcoinProductsDTO products = restClient.listProducts(getToken(), stateCode, operatorId);

            return products.getProducts().stream()
                    .map(product -> CelcoinProductMapper.toAppDTO(product))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            //Log
            throw new RuntimeException("Erro comunicação provedor serviço recarga.", e);
        }
    }

    private String getToken() {
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        CelcoinTokenDTO tokenDTO = restClient.generateToken(form);
        String token = "Bearer " + tokenDTO.getAccessToken();

        return token;
    }
}