package com.fag.controllers;

import com.fag.domain.dto.OperatorDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/operator")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OperatorController {

    @GET
    public Response listOperators() {
        return Response.ok().build();
    }

    @GET
    @Path("/{id}")
    public Response getOperator(@PathParam("id") String operatorId) {
        return Response.ok().build();
    }

    @POST
    public Response createOperator(OperatorDTO dto) {
        return Response.ok().build();
    }

    @PUT
    @Path("/{id}")
    public Response updateOperator(@PathParam("id") String operatorId) {
        return Response.ok().build();
    }

}
