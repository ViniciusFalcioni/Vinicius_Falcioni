package org.walker.tech.pix.controller;


import org.walker.tech.pix.domain.dto.PixDto;
import org.walker.tech.pix.service.PixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pix")
public class PixController {
    /**
     *
     */
    @Inject
    PixService pixService;

    public PixController(PixService pixService) {
        this.pixService = pixService;
    }

    public PixService getPixService() {
        return pixService;
    }

    public void setPixService(PixService pixService) {
        this.pixService = pixService;
    }

    /**
     * @param dto
     * @return
     */
    @POST
    @Path("/generate")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response generatePix(PixDto dto) {
        if (dto == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("PixDto cannot be null").build();
        }

        PixDto generatedPix = pixService.generatePix(dto);

        if (generatedPix != null) {
            return Response.status(Response.Status.OK).entity(generatedPix).build();
        } else {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to generate Pix").build();
        }
    }
}
