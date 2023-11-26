package com.github.faening.controllers;

import com.github.faening.domain.dto.PixQrCodeDTO;
import com.github.faening.services.PixQrCodeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1")
public class PixQrCodeController {
    @Inject
    PixQrCodeService pixQrCodeService;

    @POST
    @Path("/pix")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPixStaticQrCode(PixQrCodeDTO pixQrCodeDTO) {
        try {
            PixQrCodeDTO responseDTO = pixQrCodeService.generatePixStaticQrCode(pixQrCodeDTO);
            return Response.ok(responseDTO).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity("Erro ao gerar o pix da Celcoin: " + e.getMessage())
                .build();
        }
    }
}
