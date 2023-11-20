package service;

import java.util.List;
import domain.dto.OperatorDTO;
import domain.dto.ProductDTO;
import domain.dto.RechargeDTO;
import domain.usecases.CreateRecharge;
import domain.usecases.ListOperators;
import domain.usecases.ListProducts;
import infra.celcoin.repository.RechargeCelcoin;
import infra.panache.repositories.PanacheDataBaseRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

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

    public Response listProducts(Integer stateCode, Integer operatorId){
        ListProducts listServices = new ListProducts(celcoin);

        List<ProductDTO> operators = listServices.execute(stateCode, operatorId);

        return Response.ok(operators).build();
    }

    public Response handleRecharge(RechargeDTO dto){
        CreateRecharge createRecharge = new CreateRecharge(celcoin, panacheRepo);

        RechargeDTO createdRecharge = createRecharge.execute(dto);

        return Response.ok(createdRecharge).build();
    }
}
