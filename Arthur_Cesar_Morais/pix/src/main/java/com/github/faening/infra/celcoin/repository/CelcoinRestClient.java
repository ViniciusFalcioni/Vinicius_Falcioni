package com.github.faening.infra.celcoin.repository;

import com.github.faening.infra.celcoin.dto.CelcoinCreateStaticQrCodeRequestDTO;
import com.github.faening.infra.celcoin.dto.CelcoinCreateStaticQrCodeResponseDTO;
import com.github.faening.infra.celcoin.dto.CelcoinTokenResponseDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(configKey = "celcoin-api")
public interface CelcoinRestClient {
    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    CelcoinTokenResponseDTO getToken(
        @FormParam("client_id") String clientId,
        @FormParam("grant_type") String grantType,
        @FormParam("client_secret") String clientSecret);

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    CelcoinCreateStaticQrCodeResponseDTO createStaticQrCode(
        @HeaderParam("Authorization") String token,
        CelcoinCreateStaticQrCodeRequestDTO request);
}
