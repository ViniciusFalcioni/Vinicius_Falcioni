package com.fag.brendho.presentation;

import com.fag.brendho.domain.services.MakePix;
import com.fag.brendho.domain.usecases.IMakePixRequest;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class PixController {

    @Inject
    MakePix service;

    @GET
    @Transactional
    @Produces(MediaType.TEXT_PLAIN)
    public String handle(
        @HeaderParam("chavePix") String chavePix,
        @HeaderParam("valor") Double valor
    ) {
        System.out.println("valor is " + valor);
        System.out.println("chavePix is " + chavePix);
        return service.getQrCode(new IMakePixRequest(chavePix, valor));
    }
}
