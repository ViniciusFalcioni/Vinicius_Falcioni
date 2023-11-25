package com.gabriel.controllers;

import com.gabriel.domain.usecases.ICreateQRCodePixService;
import com.gabriel.domain.usecases.ICreateQRCodePixServiceRequest;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/perform")
public class Controller {

    @Inject
    ICreateQRCodePixService service;

    @GET
    @Transactional
    @Produces(MediaType.TEXT_PLAIN)
    public String handle(
        @HeaderParam("pix") String pix,
        @HeaderParam("amount") Double amount
    ) {
        return service.exec(new ICreateQRCodePixServiceRequest(pix, amount));
    }
}