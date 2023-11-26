package com.fag.gabriel.services;

import com.fag.gabriel.database.panache.PanachePixCode;
import com.fag.gabriel.domain.usecases.ICreatePix;
import com.fag.gabriel.domain.usecases.ICreatePixReq;
import com.fag.gabriel.repositories.celcoin.Celcoin;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CreatePix implements ICreatePix {
    @Inject
    Celcoin source;

    public String createPix(ICreatePixReq request) {
      var response = source.gen(request);
      var entity = new PanachePixCode();
      entity.setAmount(request.getPixAmount());
      entity.setEmvqrcps(response.getResponse());
      entity.setTransactionId(response.getTransactionId());
      entity.setKey(request.getPixKey());
      entity.persistAndFlush();
      return response.getResponse();
    }
}
