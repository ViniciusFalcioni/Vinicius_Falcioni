package com.fag.controllers;

import com.fag.domain.dto.RechargeDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/recharge")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RechargeController {

    @GET
    public Response listRecharges() {
        return Response.ok().build();
    }

    @GET
    @Path("/{id}")
    public Response getRecharge(@PathParam("id") String id) {
        return Response.ok().build();
    }

    @POST
    public Response createRecharge(RechargeDTO dto) {
        return Response.ok(dto).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateRecharge(@PathParam("id") String rechargeId, RechargeDTO dto) {
        return Response.ok().build();
    }

    @POST
    @Path("/{id}/approve")
    public Response approveRecharge(@PathParam("id") String rechargeId) {
        return Response.ok().build();
    }

    @POST
    @Path("/{id}/refuse")
    public Response refuseRecharge(@PathParam("id") String rechargeId) {
        return Response.ok().build();
    }

}
