package com.gabriel.repositories.celcoin;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface CelcoinRestClient {
  
  @POST
  @Path("/pix/v1/brcode/static")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON_PATCH_JSON)
  CelcoinResponse generateQrCode(CelcoinRequest request, @HeaderParam("Authorization") String token);

  @POST
  @Path("/v5/token")
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  @Produces(MediaType.APPLICATION_JSON)
  TokenResponse getCelcoinToken(TokenRequest request);
}