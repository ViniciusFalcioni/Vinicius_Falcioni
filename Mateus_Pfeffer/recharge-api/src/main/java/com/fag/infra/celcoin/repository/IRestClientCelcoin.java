package com.fag.infra.celcoin.repository;

import com.fag.infra.celcoin.dto.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedHashMap;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface IRestClientCelcoin {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CelcoinTokenDTO generateToken(MultivaluedHashMap<String, String> form);

    @GET
    @Path("/v5/transactions/topups/providers")
    CelcoinOperatorsDTO listOperators(@HeaderParam("Authorization") String token, @QueryParam("stateCode") Integer stateCode, @QueryParam("category") Integer category);

    @GET
    @Path("/v5/transactions/topups/provider-values")
    CelcoinProductsDTO listProducts(@HeaderParam("Authorization") String token, @QueryParam("stateCode") Integer stateCode, @QueryParam("providerId") Integer operatorId);

    @POST
    @Path("/v5/transactions/topups")
    @Consumes(MediaType.APPLICATION_JSON)
    CelcoinRechargeResponseDTO handleRecharge(@HeaderParam("Authorization") String token, CelcoinRechargeDTO payload);

}
