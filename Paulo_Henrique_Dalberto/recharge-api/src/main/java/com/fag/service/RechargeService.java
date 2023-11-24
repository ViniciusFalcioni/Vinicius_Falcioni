package com.fag.service;

import java.util.List;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.PixQrCodeDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositories.IPixQrCodeDataBaseRepository;
import com.fag.domain.usecases.QrCodePixCreate;
import com.fag.domain.usecases.CreateRecharge;
import com.fag.domain.usecases.ListOperators;
import com.fag.domain.usecases.ListProducts;
import com.fag.infra.celcoin.repository.PixQrCodeCelcoin;
import com.fag.infra.celcoin.repository.RechargeCelcoin;
import com.fag.infra.panache.repository.PanacheDataBaseRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class RechargeService {
  
  @Inject
  RechargeCelcoin celcoinn;

  @Inject
  PanacheDataBaseRepository RepoPanache;

  @Inject
  PixQrCodeCelcoin celcoin;

  @Inject
  IPixQrCodeDataBaseRepository panacheRepo;

  public Response listOperators(Integer stateCode, Integer category){
    ListOperators listOperators = new ListOperators(celcoinn);

    List<OperatorDTO> operators = listOperators.execute(stateCode, category);

    return Response.ok(operators).build();    
  }

  public Response listProducs(Integer stateCode, Integer operatorId){
    ListProducts listServices = new ListProducts(celcoinn);

    List<ProductDTO> operators = listServices.execute(stateCode, operatorId);

    return Response.ok(operators).build();
  }

  @Transactional
  public Response handleRecharge(RechargeDTO dto){
    CreateRecharge createRecharge = new CreateRecharge(celcoinn, RepoPanache);

    RechargeDTO createdRecharge = createRecharge.execute(dto);

    return Response.ok(createdRecharge).build();
  }

  @Transactional
  public Response handlePix(PixQrCodeDTO dto) {
    QrCodePixCreate createPix = new QrCodePixCreate(celcoin, panacheRepo);

    PixQrCodeDTO createdPix = createPix.execute(dto);

    return Response.ok(createdPix).build();
  }
}
