package com.fag.infra.celcoin.repository;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositories.IRechargeVendor;
import com.fag.infra.celcoin.dto.*;
import com.fag.infra.celcoin.mappers.CelcoinRechargeMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;
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
            CelcoinRechargeDTO rechargeDTO = CelcoinRechargeMapper.toVendorDTO(recharge);

            CelcoinRechargeResponseDTO response = restClient.handleRecharge(getToken(), rechargeDTO);
        } catch (Exception e) {
            throw new RuntimeException("Erro comunicação provedor servico recarga.");
        }

        return recharge;
    }

    @Override
    public List<OperatorDTO> listOperators(Integer stateCode, Integer category) {
        return null;
    }

    @Override
    public List<ProductDTO> listProducts(Integer stateCode, Integer operatorId) {
        return null;
    }

    private String getToken() {
        Form form = new Form();

        form.param("client_id", "");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "");

        CelcoinTokenDTO tokenDTO = restClient.generateToken(form);

        return "Beader " + tokenDTO.accessToken();
    }

}
