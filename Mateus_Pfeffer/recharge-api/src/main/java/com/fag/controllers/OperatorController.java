package com.fag.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/operator")
public class OperatorController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listOperators() {
        return Response.ok().build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOperator(@PathParam("id") String operatorId) {
        return Response.ok().build();
    }

}
