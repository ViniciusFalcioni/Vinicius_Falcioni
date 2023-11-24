package com.fag.infra.celcoin.service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.fag.infra.celcoin.dto.CelcoinQrCodePixResponseDTO;
import com.fag.infra.celcoin.dto.CelcoinQrcodePixRequestDTO;
import com.fag.infra.celcoin.dto.CelcoinQrcodePixTokenDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface CelcoinRestClient {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CelcoinQrcodePixTokenDTO generateToken(Form form);

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes(MediaType.APPLICATION_JSON)
    CelcoinQrCodePixResponseDTO handlePix(@HeaderParam("Authorization") String token, CelcoinQrcodePixRequestDTO pix);
}