package main.java.com.fag.infra.celcoin.repository;

import java.util.List;
import java.util.stream.Collectors;

import main.java.com.fag.domain.dto.OperatorDTO;
import main.java.com.fag.domain.dto.RechargeDTO;
import main.java.com.fag.infra.celcoin.dto.CelcoinOperatorDTO;
import main.java.com.fag.infra.celcoin.dto.CelcoinRechargeDTO;
import main.java.com.fag.infra.celcoin.dto.CelcoinTokenDTO;
import main.java.com.fag.infra.celcoin.mappers.CelcoinOperatorMapper;
import main.java.com.fag.infra.celcoin.mappers.CelcoinRechargeMapper;

@ApplicattionScoped
public class RechargeCelcoin implements IrechargeVendor {
    @inject
    @RestClient
    RestClientCelcoin restClient;

    @Override
    public RechargeDTO create(RechargeDTO recharge){
        try{
            CelcoinRechargeDTO rechargeDTO = CelcoinRechargeMapper.toVendorDTO(recharge);

            CelcoinRechargeRespondeDTO response = restCLient.handleRecharge(getToken(), rechargeDTO);

            recharge.setReceipt(respose.getReceipt().getReceiptData());
            recharge.setTransactionld(response.getTransactionId());
            recharge.setSuccess(response.getErrorCode().equals("000"));   
            }catch (Exception e){
                //log
                throw new RuntimeException("Erro comunicação provedor serviço recarga.");
            }

            return recharge;
    }

    @Override
    public List<OperatorDTO> listOperators(Integer stadeCode, Integer category){
        try{
            CelcoinOperatorDTO operators = restClient.listOperators(getToken(), stadeCode, category);

            return operators.getProviders().stream()
            .map(operator -> CelcoinOperatorMapper.toAppDTO(operator))
            .collect(Collectors.toList());
    }       catch(Exception e) {
            //log
            throw new RuntimeException("Erro comunucação provedor serviço recarga", e);  
            }
    }

    @Override
    public List<ProductDTO> listProducts(Integr operatorId, Integer stateCode){
        try{
            CelcoinProductsDTO products = restCLient.listProducts(getToken(), stateCode, operatorId);

            return products.getProducts().stream()
            .map(product -> CelocinProductsMapper.toAppDTO(product))
            .collect(Collectors.toList());
        }   catch(Exception e) {
                //log
                throw new RuntimeException("Erro comunicação provedor serviço recarga.");
            }
    }

    private String getToken(){
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celocoinapi.vs");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c149de7480e69b7a18c09d7cd8446839b3be82a56a044a3");

        CelcoinTokenDTO tokenDTO = restCLient.generateTOken(form);
        String token = "Bearer" + tokenDTO.getAccessToken();

        return token;
    }
}
