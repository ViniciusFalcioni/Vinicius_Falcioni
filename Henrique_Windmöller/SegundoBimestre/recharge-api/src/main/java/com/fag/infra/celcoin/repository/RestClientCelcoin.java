package main.java.com.fag.infra.celcoin.repository;

import javax.annotation.Generated;

import main.java.com.fag.infra.celcoin.dto.CelcoinOperatorDTO;
import main.java.com.fag.infra.celcoin.dto.CelcoinProductsDTO;
import main.java.com.fag.infra.celcoin.dto.CelcoinRechargeResponseDTO;
import main.java.com.fag.infra.celcoin.dto.CelcoinTokenDTO;

@ApplicattionScoped
@RegisteRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface RestClientCelcoin {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CelcoinTokenDTO generateToken(Form form);

    @GET
    @Path("/v5/transactions/topups/providers")
    CelcoinOperatorsDTO listOpearators(@HeaderParam("Authorization") String token,
        @QueryParam("stateCode") Integer stateCode, @QueryParam("category") Integer category);

    @GET 
     @Path("/v5/transactions/topups/provider-values")
     CelcoinProductsDTO listProducts(@HeaderParam("Authorization") String token,
        @QueryParam("stateCode") Integer stateCode, @QueryParam("providerId") Integer operatorId);

     @POST
    @Path("/v5/transactions/topups")
    @Consumes(MediaType.APPLICATION_JSON)
    CelcoinRechargeResponseDTO handleRecharge(@headerParam("Authorization") String token, CelcoinRechargeDTO payload);
    
}
