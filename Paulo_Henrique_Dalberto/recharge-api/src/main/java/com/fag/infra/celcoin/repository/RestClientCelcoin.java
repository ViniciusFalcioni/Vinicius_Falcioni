package com.fag.infra.celcoin.repository;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.fag.infra.celcoin.dto.recharge.CelcoinOperatorsDTO;
import com.fag.infra.celcoin.dto.recharge.CelcoinPixRequestDTO;
import com.fag.infra.celcoin.dto.recharge.CelcoinPixResponseDTO;
import com.fag.infra.celcoin.dto.recharge.CelcoinProductsDTO;
import com.fag.infra.celcoin.dto.recharge.CelcoinRechargeDTO;
import com.fag.infra.celcoin.dto.recharge.CelcoinRechargeResponseDTO;
import com.fag.infra.celcoin.dto.recharge.CelcoinTokenDTO;

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

public interface RestClientCelcoin {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CelcoinTokenDTO generateToken(Form form);

    @GET
    @Path("/v5/transactions/topups/providers")
    CelcoinOperatorsDTO listOperators(@HeaderParam("Authorization") String token, @QueryParam("stateCode") Integer stateCode, @QueryParam("category") Integer category);

    @GET
    @Path("/v5/transactions/topups/providers-values")
    CelcoinProductsDTO listProducts(@HeaderParam("Authorization") String token, @QueryParam("stateCode") Integer stateCode, @QueryParam("providerId") Integer operatorId);

    @POST
    @Path("/v5/transactions/topups")
    @Consumes(MediaType.APPLICATION_JSON)
    CelcoinRechargeResponseDTO handleRecharge(@HeaderParam("Authorization") String token, CelcoinRechargeDTO payload);

    @POST
    @Path("/pix/v5/qrcode/static")
    @Consumes(MediaType.APPLICATION_JSON)
    CelcoinPixResponseDTO   handlePix(@HeaderParam("Authorization") String token, CelcoinPixRequestDTO pix);

    
}