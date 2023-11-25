package com.gabriel.application.services;

import com.gabriel.domain.usecases.ICreateQRCodePixService;
import com.gabriel.domain.usecases.ICreateQRCodePixServiceRequest;
import com.gabriel.repositories.IQRCodeRepository;
import com.gabriel.repositories.IQRCodeRepositoryRequest;
import com.gabriel.repositories.panache.entities.PanachePixCode;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class QRCodeService implements ICreateQRCodePixService {
  
  @Inject
  IQRCodeRepository repository;


  @Override
  public String exec(ICreateQRCodePixServiceRequest params) {
    var response = repository.get(new IQRCodeRepositoryRequest(params.getKey(), params.getAmount()));
    PanachePixCode entity = new PanachePixCode();
    entity.setAmount(params.getAmount());
    entity.setEmvqrcps(response.getResponse());
    entity.setTransactionId(response.getTransactionId());
    entity.setKey(params.getKey());
    entity.persistAndFlush();
    return response.getResponse();
  }
  
}
