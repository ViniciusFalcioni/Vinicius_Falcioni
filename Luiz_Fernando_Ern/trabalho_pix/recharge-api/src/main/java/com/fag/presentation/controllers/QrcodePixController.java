package com.fag.presentation.controllers;

import com.fag.domain.dto.QrcodePixDTO;
import com.fag.services.QrcodePixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/pix")
public class QrcodePixController {

    @Inject
    private QrcodePixService service;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response handlePix(QrcodePixDTO dto) {
        return service.handlePix(dto);
    }
}