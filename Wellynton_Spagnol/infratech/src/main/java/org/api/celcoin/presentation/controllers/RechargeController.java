package org.api.celcoin.presentation.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.api.celcoin.domain.dto.RechargeDTO;
import org.api.celcoin.service.RechargeService;

@Path("/v1/recharge")
public class RechargeController {

    @Inject
    RechargeService service;

    @GET
    @Path("/operators")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listOperators(@HeaderParam("stateCode") Integer stateCode,
                                  @HeaderParam("category") Integer category) {
        return service.listOperators(stateCode, category);
    }

    @GET
    @Path("/products")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listProducts(@HeaderParam("stateCode") Integer stateCode,
                                 @HeaderParam("operatorId") Integer operatorId) {
        return service.listProducts(stateCode, operatorId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handleRecharge(RechargeDTO dto) {
        return service.handleRecharge(dto);
    }

}