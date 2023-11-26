package org.bortoli.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.bortoli.domain.dto.PixQrCodeDTO;
import org.bortoli.service.PixQrCodeService;

@Path("/v1")
public class PixQrCodeController {
    @Inject
    PixQrCodeService service;

    @POST
    @Path("/pix")
    @Produces({"application/json"})
    public PixQrCodeDTO create(PixQrCodeDTO dto) {
        return service.genPix(dto);
    }
}
