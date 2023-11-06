package com.fag.controllers;


import com.fag.domain.dto.RechargeDTO;
import com.fag.service.RechargeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/recharge")
public class RechargeController {
    @Inject
    RechargeService service;

    @Path("/operators")

    @Produces(MediaType.APPLICATION_JSON)
    public Response listOperators(@HeaderParam("stateCode") Integer stateCode,
                                  @HeaderParam("catogry") Integer category) {
        return service.listOperators(stateCode, category);
    }

    @GET
    @Path("/products")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listProducts(@HeaderParam("stateCode") Integer stateCode,
                                 @HeaderParam("operatorId") Integer operatorId) {
        return service.listProducs(stateCode, operatorId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handleRecharge(RechargeDTO dto){
        return service.handleRecharge(dto);
    }
}

