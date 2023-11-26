package com.fag.infra.celcoin.repository;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.fag.infra.celcoin.dto.pix.PixQrCodeOperatorsDTO;
import com.fag.infra.celcoin.dto.pix.PixQrCodeProductsDTO;
import com.fag.infra.celcoin.dto.pix.PixQrCodeRechargeDTO;
import com.fag.infra.celcoin.dto.pix.PixQrCodeRechargeResponseDTO;
import com.fag.infra.celcoin.dto.pix.PixQrCodeRequestDTO;
import com.fag.infra.celcoin.dto.pix.PixQrCodeResponseDTO;
import com.fag.infra.celcoin.dto.pix.PixQrCodeTokenDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface PixQrCodeCelcoinRestClient {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    PixQrCodeTokenDTO generateToken(Form form);

    @GET
    @Path("/v5/transactions/topups/providers")
    PixQrCodeOperatorsDTO listOperators(@HeaderParam("Authorization") String token,
        @QueryParam("stateCode") Integer stateCode, @QueryParam("category") Integer category);

    @GET
    @Path("/v5/transactions/topups/provider-values")
    PixQrCodeProductsDTO listProducts(@HeaderParam("Authorization") String token,
        @QueryParam("stateCode") Integer stateCode, @QueryParam("providerId") Integer operatorId);

    @POST
    @Path("/v5/transactions/topups")
    @Consumes(MediaType.APPLICATION_JSON)
        PixQrCodeRechargeResponseDTO handleRecharge(@HeaderParam("Authorization") String token, PixQrCodeRechargeDTO payload);

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes(MediaType.APPLICATION_JSON)
        PixQrCodeResponseDTO handlePix(@HeaderParam("Authorization") String token, PixQrCodeRequestDTO pix);
}
