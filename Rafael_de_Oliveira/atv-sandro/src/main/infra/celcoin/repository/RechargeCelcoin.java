import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class RechargeCellcoin implements IVendorRepository
{
    @Inject
    @RestClient
    RestClientCelcoin restClient;

    @Override
    public RechargeDTO create(RechargeDTO recharge)
    {
        try {
            CelcoinRechargeDTO rechargeDTO = CelcoinRechargeMapper.toVendorDTO(recharge);

            CelcoinRechargeResponseDTO response = restClient.handleRecharge(getToken(), rechargeDTO);

            recharge.setReceipt(response.getReceipt().getReceiptData());
            recharge.setTransactionId(response.getTransaction());
            recharge.setSuccess(response.getErrorCode().equals("000"));
        }catch(Exception e) {
            throw new RuntimeException("Erro de comunicação com o provedor de serviço de recarga.");
        }

        return recharge;
    }

    @Override
    public List<ProductDTO> listProducts(Integer operatorId, Integer stateCode)
    {
        try{
            CelcoinProductsDTO products = restClient.listProducts(getToken(), stateCode, operatorId);

            return products.getProducts().stream().map(product -> CelcoinProductMapper.toAppDTO(product)).collect(Collectors.toList());
        }catch(Exception e){
            throw new RuntimeException("Erro de comunicação com o provedor de serviço de recarga.");
        }
    }

    private String getToken()
    {
        Form form = new Form();
        
        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        CelcoinTokenDTO tokenDTO = restClient.generateToken(form);
        String token = "Bearer " + tokenDTO.getAccessToken();

        return token;
    }
}
