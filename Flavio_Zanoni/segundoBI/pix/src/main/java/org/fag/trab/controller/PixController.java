package org.fag.trab.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.fag.trab.domain.dto.PixDto;
import org.fag.trab.service.PixService;

@Path("/pix")
public class PixController {
    @Inject
    PixService pixService;

    @POST
    @Path("/generate")
    @Produces({"application/json"})
    public PixDto generatePix(PixDto dto) {
        return pixService.generatePix(dto);
    }
}
