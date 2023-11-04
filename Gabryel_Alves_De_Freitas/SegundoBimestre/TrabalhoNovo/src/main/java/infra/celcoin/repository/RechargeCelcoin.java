package infra.celcoin.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import domain.dto.OperatorDTO;
import domain.dto.ProductDTO;
import domain.dto.RechargeDTO;
import domain.repositories.IRechargeVendorRepository;
import infra.celcoin.dto.CelcoinOperatorsDTO;
import infra.celcoin.dto.CelcoinProductsDTO;
import infra.celcoin.dto.CelcoinRechargeDTO;
import infra.celcoin.dto.CelcoinRechargeResponseDTO;
import infra.celcoin.dto.CelcoinTokenDTO;
import infra.celcoin.mappers.CelcoinOperatorMapper;
import infra.celcoin.mappers.CelcoinProductMapper;
import infra.celcoin.mappers.CelcoinRechargeMapper;
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
            throw new RuntimeException("Erro comunicação provedor service recarga.");
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
            throw new RuntimeException("Erro comunicação provedor service recarga.");
        }
    }

    @Override
    public List<ProductDTO> listProducts(Integer stateCode, Integer operatorId) {
        try {
            CelcoinProductsDTO operators = restClient.listProducts(getToken(), stateCode, operatorId);

            return operators.getProducts().stream()
                    .map(product -> CelcoinProductMapper.toAppDTO(product))
                    .collect(Collectors.toList());

        } catch (Exception e) {
            throw new RuntimeException("Erro comunicação provedor service recarga.");
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
