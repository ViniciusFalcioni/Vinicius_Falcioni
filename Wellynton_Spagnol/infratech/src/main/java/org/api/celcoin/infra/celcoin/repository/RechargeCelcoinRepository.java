package org.api.celcoin.infra.celcoin.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;
import org.api.celcoin.domain.dto.OperatorDTO;
import org.api.celcoin.domain.dto.ProductDTO;
import org.api.celcoin.domain.dto.RechargeDTO;
import org.api.celcoin.domain.repositories.IRechargeVendorRepository;
import org.api.celcoin.infra.celcoin.dto.*;
import org.api.celcoin.infra.celcoin.mappers.CelcoinOperatorMapper;
import org.api.celcoin.infra.celcoin.mappers.CelcoinProductMapper;
import org.api.celcoin.infra.celcoin.mappers.CelcoinRechargeMapper;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class RechargeCelcoinRepository implements IRechargeVendorRepository {

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
            throw new RuntimeException("Erro comunicaçã o provedor servico recarga.");
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
            throw new RuntimeException("Erro comunicação provedor servico recarga.", e);
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
            throw new RuntimeException("Erro comunicação provedor servico recarga.");
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
