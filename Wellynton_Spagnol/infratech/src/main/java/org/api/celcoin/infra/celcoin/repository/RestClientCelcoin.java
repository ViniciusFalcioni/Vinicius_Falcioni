package org.api.celcoin.infra.celcoin.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import org.api.celcoin.infra.celcoin.dto.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface RestClientCelcoin {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CelcoinTokenDTO generateToken(Form form);

    @GET
    @Path("/v5/transactions/topups/providers")
    CelcoinOperatorsDTO listOperators(@HeaderParam("Authorization") String token,
                                      @QueryParam("stateCode") Integer stateCode, @QueryParam("category") Integer category);

    @GET
    @Path("/v5/transactions/topups/provider-values")
    CelcoinProductsDTO listProducts(@HeaderParam("Authorization") String token,
                                    @QueryParam("stateCode") Integer stateCode, @QueryParam("providerId") Integer operatorId);

    @POST
    @Path("/v5/transactions/topups")
    @Consumes(MediaType.APPLICATION_JSON)
    CelcoinRechargeResponseDTO handleRecharge(@HeaderParam("Authorization") String token, CelcoinRechargeDTO payload);

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes(MediaType.APPLICATION_JSON)
    CelcoinPixResponseDTO handlePix(@HeaderParam("Authorization") String token, CelcoinPixDTO pix);

}
