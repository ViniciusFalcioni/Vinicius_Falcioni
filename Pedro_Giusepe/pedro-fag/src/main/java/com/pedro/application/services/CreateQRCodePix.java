package com.pedro.application.services;

import com.pedro.domain.usecases.ICreateQRCodePix;
import com.pedro.domain.usecases.ICreateQRCodePixRequest;
import com.pedro.repositories.IQRCodeRepository;
import com.pedro.repositories.IQRCodeRepositoryRequest;
import com.pedro.repositories.panache.entities.PanachePixCode;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CreateQRCodePix implements ICreateQRCodePix {
  
  @Inject
  IQRCodeRepository repository;


  @Override
  public String perform(ICreateQRCodePixRequest params) {
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
