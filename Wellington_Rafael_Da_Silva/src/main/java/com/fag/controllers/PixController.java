package com.fag.controllers;

import com.fag.domain.dto.PixCelcoinDTO;
import com.fag.service.CelcoinPixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/pix")
public class PixController {
    @Inject
    CelcoinPixService service;
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handlePix(PixCelcoinDTO dto) {
        return service.handlePix(dto);
    }
}