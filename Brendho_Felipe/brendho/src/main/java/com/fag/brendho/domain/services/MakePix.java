package com.fag.brendho.domain.services;

import com.fag.brendho.domain.usecases.IMakePix;
import com.fag.brendho.domain.usecases.IMakePixRequest;
import com.fag.brendho.infra.db.panache.PanachePixCode;
import com.fag.brendho.infra.impl.celcoin.CelcoinIMPL;
import com.fag.brendho.infra.protocols.IQrCodeSourceResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MakePix implements IMakePix {

  @Inject
  CelcoinIMPL source;

  public String getQrCode(IMakePixRequest request) {
    IQrCodeSourceResponse response = source.generate(request);
    PanachePixCode entity = new PanachePixCode();
    entity.setAmount(request.getValue());
    entity.setEmvqrcps(response.getResponse());
    entity.setTransactionId(response.getTransactionId());
    entity.setKey(request.getChave());
    entity.persistAndFlush();
    return response.getResponse();
  }
}
