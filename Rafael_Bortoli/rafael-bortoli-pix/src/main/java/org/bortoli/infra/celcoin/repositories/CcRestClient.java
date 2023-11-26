package org.bortoli.infra.celcoin.repositories;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import org.bortoli.infra.celcoin.dto.CcPixRequestDTO;
import org.bortoli.infra.celcoin.dto.CcPixResponseDTO;
import org.bortoli.infra.celcoin.dto.CcTokenResponseDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(
        configKey = "base-uri-cc"
)
public interface CcRestClient {
    @POST
    @Path("/v5/token")
    @Consumes({"application/x-www-form-urlencoded"})
    CcTokenResponseDTO getToken(@FormParam("client_id") String clientId, @FormParam("grant_type") String grantType, @FormParam("client_secret") String clientSecret);

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes({"application/json"})
    CcPixResponseDTO createStaticPix(@HeaderParam("Authorization") String token, CcPixRequestDTO request);
}
