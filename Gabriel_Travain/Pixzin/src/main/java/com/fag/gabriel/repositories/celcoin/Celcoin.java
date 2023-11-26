package com.fag.gabriel.repositories.celcoin;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.gabriel.domain.usecases.ICreatePixReq;
import com.fag.gabriel.repositories.contracts.IGenPixRepo;
import com.fag.gabriel.repositories.contracts.IGenPixRepoResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Celcoin implements IGenPixRepo {

  @Inject
  @RestClient
  CelcoinRestClient restClient;

  @Override
  public IGenPixRepoResponse gen(ICreatePixReq pix) {
    CelcoinTokenResponse token = restClient.token(new CelcoinTokenRequest());
    CelResponse response = restClient.qrCode(
      new CelRequest(pix.getPixKey(), pix.getPixAmount(), "testqrcodestaticcelcoin", new CelMerchant("85344450", "cascavel", 0, "brendho"), List.of(""), "Teeste fag", false),
      token.getAccessToken()
    );
    return new IGenPixRepoResponse(response.getEmvqrcps(), response.getTransactionId());
  }
}
