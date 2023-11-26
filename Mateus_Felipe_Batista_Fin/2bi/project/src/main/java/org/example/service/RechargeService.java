package org.example.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.example.domain.dto.OperatorDTO;
import org.example.domain.dto.ProductDTO;
import org.example.domain.dto.RechargeDTO;
import org.example.domain.usecases.CreateRecharge;
import org.example.domain.usecases.ListOperators;
import org.example.domain.usecases.ListProducts;
import org.example.infra.celcoin.repository.RechargeCelcoin;
import org.example.infra.panache.repository.PanacheDataBaseRepository;

import java.util.List;

@ApplicationScoped
public class RechargeService {

    @Inject
    RechargeCelcoin celcoin;

    @Inject
    PanacheDataBaseRepository panacheRepo;

    public Response listOperators(Integer stateCode, Integer category) {
        ListOperators listOperators = new ListOperators(celcoin);

        List<OperatorDTO> operators = listOperators.execute(stateCode, category);

        return Response.ok(operators).build();
    }

    public Response listProducts(Integer satateCode, Integer operatorId) {
        ListProducts listServices = new ListProducts(celcoin);

        List<ProductDTO> operators = listServices.execute(satateCode,operatorId);

        return Response.ok(operators).build();
    }

    public Response handleRecharge(RechargeDTO dto) {
        CreateRecharge createRecharge = new CreateRecharge(celcoin,panacheRepo);

        RechargeDTO createdRecharge = createRecharge.execute(dto);

        return Response.ok(createdRecharge).build();
    }

}
