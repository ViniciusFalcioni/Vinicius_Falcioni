package main.java.com.fag.service;

import main.java.com.fag.domain.dto.RechargeDTO;
import main.java.com.fag.domain.usecases.CreateRecharge;
import main.java.com.fag.domain.usecases.ListOperators;
import main.java.com.fag.infra.celcoin.repository.RechargeCelcoin;
import main.java.com.fag.infra.panache.model.PanacheDataBaseRepository;

@ApplicattionScoped
public class RecahrgeService {
    @inject
    RechargeCelcoin celcoin;

    @inject
    PanacheDataBaseRepository panacheRepo;

    public Response listOperators(Integer stateCode, Integer category){
        ListOperators listOperators = new ListOperators(celcoin);

        List<OperatorDTO> operators = listOperators.execute(stateCode, category);

        return Response.ok(operators).build();
    
    }

    public Response listProducts(Integer stateCode, Integer operatorId){
        ListOperatorServices listServices = new ListOperatorServices(celcoin);

        List<ProductDTO> operators = listServices.execute(stateCode, operatorId);

        return Response.ok(operators).build();
    }

    @Transactional
    public Response handleRecharge(RechargeDTO dto){
        CreateRecharge createRecharge = new CreateRecharge(celcoin, panacheRepo);

        RechargeDTO = createdRecharge = createRecharge.execute(dto);

        return Resonse.ok(createdRecharge).build();
    }
}
