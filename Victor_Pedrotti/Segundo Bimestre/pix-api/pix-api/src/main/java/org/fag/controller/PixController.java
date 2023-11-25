package org.fag.controller;

import org.fag.domain.dto.PixDTO;
import org.fag.service.PixService;

import jakarta.ws.rs.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pix")
public class PixController {

    @Inject
    PixService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handlePix(PixDTO dto) {
        return service.handlePix(dto);
    }

}