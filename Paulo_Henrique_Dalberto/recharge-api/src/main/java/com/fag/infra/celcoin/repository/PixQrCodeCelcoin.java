package com.fag.infra.celcoin.repository;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.domain.dto.PixQrCodeDTO;
import com.fag.domain.repositories.IPixQrCodeVendor;
import com.fag.infra.celcoin.dto.pix.PixQrCodeRequestDTO;
import com.fag.infra.celcoin.dto.pix.PixQrCodeResponseDTO;
import com.fag.infra.celcoin.dto.pix.PixQrCodeTokenDTO;
import com.fag.infra.celcoin.mappers.PixQrCodeMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;

@ApplicationScoped
public class PixQrCodeCelcoin implements IPixQrCodeVendor {

  @Inject
  @RestClient
  PixQrCodeCelcoinRestClient restClient;

  @Override
  public PixQrCodeDTO create(PixQrCodeDTO pix) {
    PixQrCodeRequestDTO pixDTO = PixQrCodeMapper.toVendorDTO(pix);

    PixQrCodeResponseDTO response = restClient.handlePix(getToken(), pixDTO);

    pix.setQrCode(response.getQrCode());
    pix.setTransactionId(response.getTransactionId());

    return pix;
  }

  private String getToken() {
    Form form = new Form();

    form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
    form.param("grant_type", "client_credentials");
    form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

    PixQrCodeTokenDTO tokenDTO = restClient.generateToken(form);
    String token = "Bearer " + tokenDTO.getAccessToken();

    return token;
  }
}
