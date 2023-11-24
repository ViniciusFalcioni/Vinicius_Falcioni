package org.apicellcoin.controllers;

import org.apicellcoin.domain.dto.PixCelcoinDTO;
import org.apicellcoin.service.CelcoinPixService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pix")
public class CelcoinPixController {

    @Inject
    CelcoinPixService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handlePix(PixCelcoinDTO dto) {
        return service.handlePix(dto);
    }

}