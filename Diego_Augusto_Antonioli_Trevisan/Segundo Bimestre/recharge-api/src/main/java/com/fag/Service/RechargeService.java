package com.fag.Service;

import java.util.List;

import com.fag.Domain.DTO.OperatorDTO;
import com.fag.Domain.DTO.ProductDTO;
import com.fag.Domain.DTO.RechargeDTO;
import com.fag.Domain.UseCases.CreateRecharge;
import com.fag.Domain.UseCases.ListOperators;
import com.fag.Infra.Celcoin.Repository.RechargeCelcoin;
import com.fag.Infra.Panache.Repository.PanacheDataBaseRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class RechargeService {

    @Inject
    RechargeCelcoin celcoin;

    @Inject
    PanacheDataBaseRepository panacheRepo;

    public Response listOperators(Integer stateCode, Integer category) {

        ListOperators listOperators = listOperators(celcoin);

        List<OperatorDTO> operators = listOperators.execute(stateCode, category);

        return Response.ok(operators).build();
    }

    public Response listProducts(Integer stateCode, Integer operatorId) {
        ListOperatorServices listServices = new ListOperatorServices(celcoin);

        List<ProductDTO> operators = listServices.execute(stateCode, operatorId);

        return Response.ok(operators).build();
    }

    @Transactional
    public Response handleRecharge(RechargeDTO dto){
        CreateRecharge createRecharge = new CreateRecharge(celcoin, panacheRepo);

        RechargeDTO createdRecharge = createRecharge.execute(dto);

        return Response.ok(createdRecharge).build();
    }
}
