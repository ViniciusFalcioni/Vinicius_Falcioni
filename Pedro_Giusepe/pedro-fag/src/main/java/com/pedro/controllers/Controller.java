package com.pedro.controllers;

import com.pedro.domain.usecases.ICreateQRCodePix;
import com.pedro.domain.usecases.ICreateQRCodePixRequest;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pix")
public class Controller {

    @Inject
    ICreateQRCodePix service;

    @GET
    @Transactional
    @Produces(MediaType.TEXT_PLAIN)
    public String handle(
        @HeaderParam("pix") String pix,
        @HeaderParam("amount") Double amount
    ) {
        return service.perform(new ICreateQRCodePixRequest(pix, amount));
    }
}