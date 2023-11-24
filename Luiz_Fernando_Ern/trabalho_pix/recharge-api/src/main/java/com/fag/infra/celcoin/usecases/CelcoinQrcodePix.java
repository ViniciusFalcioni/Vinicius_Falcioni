package com.fag.infra.celcoin.usecases;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.domain.dto.QrcodePixDTO;
import com.fag.domain.repositories.IQrcodePixVendor;
import com.fag.infra.celcoin.dto.CelcoinQrCodePixResponseDTO;
import com.fag.infra.celcoin.dto.CelcoinQrcodePixRequestDTO;
import com.fag.infra.celcoin.dto.CelcoinQrcodePixTokenDTO;
import com.fag.infra.celcoin.mappers.CelcoinQrcodePixMapper;
import com.fag.infra.celcoin.service.CelcoinRestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;

@ApplicationScoped
public class CelcoinQrcodePix implements IQrcodePixVendor {

  @Inject
  @RestClient
  CelcoinRestClient restClient;

  @Override
  public QrcodePixDTO create(QrcodePixDTO pix) {
    CelcoinQrcodePixRequestDTO pixDTO = CelcoinQrcodePixMapper.toVendorDTO(pix);

    CelcoinQrCodePixResponseDTO response = restClient.handlePix(getToken(), pixDTO);

    pix.setQrCode(response.getQrCode());
    pix.setTransactionId(response.getTransactionId());
    pix.setAdditionalInformation(response.getAdditionalInformation());

    return pix;
  }

  private String getToken() {
    Form form = new Form();

    form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
    form.param("grant_type", "client_credentials");
    form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

    CelcoinQrcodePixTokenDTO tokenDTO = restClient.generateToken(form);
    String token = "Bearer " + tokenDTO.getAccessToken();

    return token;
  }
}