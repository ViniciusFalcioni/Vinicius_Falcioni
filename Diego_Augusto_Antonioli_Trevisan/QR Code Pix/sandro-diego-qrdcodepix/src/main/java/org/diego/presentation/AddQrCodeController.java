package org.diego.presentation;

import org.diego.data.services.DbAddQrCode;
import org.diego.domain.contracts.AddQrCodeResponse;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.core.MediaType;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/api")
public class AddQrCodeController {

    @Inject
    DbAddQrCode service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AddQrCodeResponse handle(@HeaderParam("key") String key, @HeaderParam("amount") Double amount) {
    
        return new AddQrCodeResponse(key, amount);
    }
}
