package org.apicellcoin.infra.celcoin.services;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.apicellcoin.infra.celcoin.dto.CelcoinBase64QRCodeDTO;
import org.apicellcoin.infra.celcoin.dto.CelcoinOperatorsDTO;
import org.apicellcoin.infra.celcoin.dto.CelcoinPixDTO;
import org.apicellcoin.infra.celcoin.dto.CelcoinPixResponseDTO;
import org.apicellcoin.infra.celcoin.dto.CelcoinProductsDTO;
import org.apicellcoin.infra.celcoin.dto.CelcoinRechargeDTO;
import org.apicellcoin.infra.celcoin.dto.CelcoinRechargeResponseDTO;
import org.apicellcoin.infra.celcoin.dto.CelcoinTokenDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface CelcoinServices {

        @GET
        @Path("/v5/transactions/topups/providers")
        CelcoinOperatorsDTO listOperators(@HeaderParam("Authorization") String token,
                        @QueryParam("stateCode") Integer stateCode, @QueryParam("category") Integer category);

        @GET
        @Path("/v5/transactions/topups/provider-values")
        CelcoinProductsDTO listProducts(@HeaderParam("Authorization") String token,
                        @QueryParam("stateCode") Integer stateCode, @QueryParam("providerId") Integer operatorId);

        @GET
        @Path("/pix/v1/brcode/static/{transactionId}/base64")
        CelcoinBase64QRCodeDTO getBase64QRCode(@HeaderParam("Authorization") String token,
                        @PathParam("transactionId") String transactionId);

        @POST
        @Path("/v5/token")
        @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
        CelcoinTokenDTO generateToken(Form form);

        @POST
        @Path("/v5/transactions/topups")
        @Consumes(MediaType.APPLICATION_JSON)
        CelcoinRechargeResponseDTO handleRecharge(@HeaderParam("Authorization") String token,
                        CelcoinRechargeDTO payload);

        @POST
        @Path("/pix/v1/brcode/static")
        @Consumes(MediaType.APPLICATION_JSON)
        CelcoinPixResponseDTO handlePix(@HeaderParam("Authorization") String token, CelcoinPixDTO pix);
}