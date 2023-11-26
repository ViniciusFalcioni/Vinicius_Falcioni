package org.raul.infra.providers.celcoin;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.raul.infra.providers.celcoin.token.TokenRequest;
import org.raul.infra.providers.celcoin.token.TokenResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.quarkus.rest.client.reactive.ClientExceptionMapper;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface CelcoinRestClient {

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    CelcoinResponse generateQrCode(CelcoinRequest request, @HeaderParam("Authorization") String token);

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    TokenResponse getCelcoinToken(TokenRequest request);

    @ClientExceptionMapper
    static RuntimeException toException(Response response) throws JsonProcessingException {
        var status = response.getStatus();
        System.out.println("Response with the status code: " + status);
        System.out.println("Response with the body: " + new ObjectMapper().writeValueAsString(response.getEntity()));

        return null;
    }
}
