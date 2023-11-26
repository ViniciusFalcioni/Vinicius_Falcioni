package org.api.celcoin.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.api.celcoin.domain.dto.OperatorDTO;
import org.api.celcoin.domain.dto.ProductDTO;
import org.api.celcoin.domain.dto.RechargeDTO;
import org.api.celcoin.domain.usecases.CreateRecharge;
import org.api.celcoin.domain.usecases.ListOperators;
import org.api.celcoin.domain.usecases.ListProducts;
import org.api.celcoin.infra.celcoin.repository.RechargeCelcoinRepository;
import org.api.celcoin.infra.panache.repository.PanacheDataBaseRepository;

import java.util.List;

@ApplicationScoped
public class RechargeService {

    @Inject
    RechargeCelcoinRepository celcoin;

    @Inject
    PanacheDataBaseRepository panacheRepo;

    public Response listOperators(Integer stateCode, Integer category) {
        ListOperators listOperators = new ListOperators(celcoin);

        List<OperatorDTO> operators = listOperators.execute(stateCode, category);

        return Response.ok(operators).build();
    }

    public Response listProducts(Integer stateCode, Integer operatorId) {
        ListProducts listServices = new ListProducts(celcoin);

        List<ProductDTO> operators = listServices.execute(stateCode, operatorId);

        return Response.ok(operators).build();
    }

    @Transactional
    public Response handleRecharge(RechargeDTO dto) {
        CreateRecharge createRecharge = new CreateRecharge(celcoin, panacheRepo);

        RechargeDTO createdRecharge = createRecharge.execute(dto);

        return Response.ok(createdRecharge).build();
    }

}
