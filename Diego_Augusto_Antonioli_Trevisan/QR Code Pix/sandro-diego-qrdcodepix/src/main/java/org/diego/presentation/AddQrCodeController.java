package org.diego.presentation;

import org.diego.data.services.DbAddQrCode;
import org.diego.domain.entities.QrCode;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api")
public class AddQrCodeController {

    @Inject
    DbAddQrCode service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handle(QrCode qrCode) {
        return service.execute(qrCode);
    }
}
