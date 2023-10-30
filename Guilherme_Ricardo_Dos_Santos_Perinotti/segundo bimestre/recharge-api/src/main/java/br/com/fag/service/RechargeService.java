package br.com.fag.service;

import java.util.List;

import br.com.fag.domain.dto.OperatorDTO;
import br.com.fag.domain.dto.ProductDTO;
import br.com.fag.domain.dto.RechargeDTO;
import br.com.fag.domain.usecases.CreateRecharge;
import br.com.fag.domain.usecases.ListOperators;
import br.com.fag.domain.usecases.ListProducts;
import br.com.fag.infra.celcoin.repository.RechargeCelcoin;
import br.com.fag.infra.panache.repository.PanacheDatabaseRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class RechargeService {
  
  @Inject
  RechargeCelcoin celcoin;

  @Inject
  PanacheDatabaseRepository panacheRepo;

  public Response listOperators(Integer stateCode, Integer category) {
    ListOperators listOperators = new ListOperators(celcoin);

    List<OperatorDTO> operators = listOperators.execute(stateCode, category);

    return Response.ok(operators).build();
  }

  public Response listProducts(Integer stateCode, Integer operatorId) {
    ListProducts listProducts = new ListProducts(celcoin);

    List<ProductDTO> products = listProducts.execute(operatorId);

    return Response.ok(products).build();
  }

  @Transactional
  public Response handleRecharge(RechargeDTO dto) {
    CreateRecharge createRecharge = new CreateRecharge(celcoin, panacheRepo);
    RechargeDTO createdRecharge = createRecharge.execute(dto);

    return Response.ok(createdRecharge).build();
  }
}
