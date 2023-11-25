package org.raul.presentation;

import java.util.Map;

import org.raul.data.services.GenerateQrCode;
import org.raul.domain.contracts.QrCodeResponse;
import org.raul.domain.entities.Merchant;
import org.raul.domain.entities.QrCode;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/raul")
public class Controller {

    @Inject
    GenerateQrCode service;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response handle(@HeaderParam("key") String key, @HeaderParam("amount") Double amount) {

        try {
            QrCodeResponse response = service.execute(new QrCode(new Merchant(), amount, key, ""));
            return Response.status(200).entity(response).build();

        } catch (Exception e) {
            return Response.status(500).entity(Map.of("info", e.getMessage())).build();
        }

    }
}
