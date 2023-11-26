package org.walker.tech.pix.infra.celcoin.repositories;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.walker.tech.pix.infra.celcoin.dto.PixCelcoinDto;
import org.walker.tech.pix.infra.celcoin.dto.PixCelcoinResponseDto;
import org.walker.tech.pix.infra.celcoin.dto.TokenCelcoinDto;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Form;

@ApplicationScoped
@RegisterRestClient(configKey = "celcoin-url")
public interface RestClientCelcoin {

    @POST
    @Path("/v5/token")
    @Consumes("application/x-www-form-urlencoded")
    TokenCelcoinDto getToken(Form form);

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes("application/json")
    static
    PixCelcoinResponseDto generatePix(@HeaderParam("Authorization") String token, PixCelcoinDto request) {
        throw new UnsupportedOperationException("Unimplemented method 'generatePix'");
    }
}
