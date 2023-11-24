package java.org.example.infra.celcoin.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import main.java.org.example.domain.dto.OperatorDTO;
import main.java.org.example.domain.dto.ProductDTO;
import main.java.org.example.domain.dto.RechargeDTO;
import main.java.org.example.domain.repositories.IRechargeVendor;
import main.java.org.example.infra.celcoin.dto.CelcoinRechargeDTO;
import main.java.org.example.infra.celcoin.mappers.CelcoinRechargeMapper;
import main.java.org.example.infra.celcoin.repository.RestClientCelcoin;
import org.eclipse.microprofile.rest.client.inject.RestClient;


import java.util.List;

@ApplicationScoped
public class RechargeCelcoin implements IRechargeVendor {
    @Inject
    @RestClient
    RestClientCelcoin restClient;
    @Override
    public RechargeDTO create(RechargeDTO recharge) {

        try {
            CelcoinRechargeDTO rechargeDTO;
            rechargeDTO = CelcoinRechargeMapper.toVendorDTO(recharge);

            CelcoinRechargeMapper response = restClient.;
        }
    };

    @Override
    public List<OperatorDTO> listOperators(Integer stateCode, Integer category) {
        return null;
    }

    @Override
    public List<ProductDTO> listProducts(Integer stateCode, Integer operatorId) {
        return null;
    }


}
