package com.fag.brendho.infra.impl.celcoin;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.brendho.domain.usecases.IMakePixRequest;
import com.fag.brendho.infra.protocols.IQrCodeSource;
import com.fag.brendho.infra.protocols.IQrCodeSourceResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CelcoinIMPL implements IQrCodeSource {

  @Inject
  @RestClient
  CelcoinRestClient restClient;

  public IQrCodeSourceResponse generate(IMakePixRequest dto) {
    CelcoinTokenResponse token = restClient.getCelcoinToken(new CelcoinTokenRequest());
    CelcoinResponse response = restClient.generateQrCode(
      new CelcoinRequest(dto.getChave(), dto.getValue(), "testqrcodestaticcelcoin", new CelcoinMerchant("85344450", "cascavel", 0, "brendho"), List.of(""), "Teeste fag", false),
      token.getAccessToken()
    );
    return new IQrCodeSourceResponse(response.getEmvqrcps(), response.getTransactionId());
  }
}
