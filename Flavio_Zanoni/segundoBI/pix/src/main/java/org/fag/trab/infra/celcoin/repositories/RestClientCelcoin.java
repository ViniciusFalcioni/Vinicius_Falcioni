package org.fag.trab.infra.celcoin.repositories;

import io.vertx.codegen.doc.Token;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Form;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.fag.trab.infra.celcoin.dto.PixCelcoinDto;
import org.fag.trab.infra.celcoin.dto.PixCelcoinResponseDto;
import org.fag.trab.infra.celcoin.dto.TokenCelcoinDto;

@ApplicationScoped
@RegisterRestClient(
        configKey = "celcoin-url"
)
public interface RestClientCelcoin {
    @POST
    @Path("/v5/token")
    @Consumes({"application/x-www-form-urlencoded"})
    TokenCelcoinDto getToken(Form form);

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes({"application/json"})
    PixCelcoinResponseDto generatePix(@HeaderParam("Authorization") String token, PixCelcoinDto request);
}
