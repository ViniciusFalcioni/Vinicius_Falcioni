package com.gabriel.repositories.celcoin;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.gabriel.repositories.IQRCodeRepository;
import com.gabriel.repositories.IQRCodeRepositoryRequest;
import com.gabriel.repositories.IQRCodeRepositoryResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CelcoinQRCodeRepository implements IQRCodeRepository{

  @Inject
  @RestClient
  CelcoinRestClient rest;

  @Override
  public IQRCodeRepositoryResponse get(IQRCodeRepositoryRequest request) {
    var tokem = rest.getCelcoinToken(new TokenRequest());
    CelcoinResponse response = rest.generateQrCode(
      new CelcoinRequest(request.getKey(), request.getAmount(), "testqrcodestaticcelcoin", new CelcoinMerchant("85344450", "cascavel", 0, "brendho"), List.of(""), "Teeste fag", false),
      tokem.getAccessToken()
    );
    return new IQRCodeRepositoryResponse(response.getEmvqrcps(), response.getTransactionId());
  }
  
}
