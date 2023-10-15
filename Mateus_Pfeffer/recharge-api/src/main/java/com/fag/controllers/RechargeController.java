package com.fag.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/recharge")
public class RechargeController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listRecharges() {
        return Response.ok().build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRecharge(@PathParam("id") String id) {
        return Response.ok().build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createRecharge() {
        return Response.ok().build();
    }

}
