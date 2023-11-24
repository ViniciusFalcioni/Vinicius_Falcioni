package com.fag.controllers;

import com.fag.domain.dto.PixQrCodeDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.service.RechargeService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1")
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
  public Response listProducs (@HeaderParam("stateCode") Integer stateCode,
    @HeaderParam("operatorId") Integer operatorId) {
    return service.listProducs(stateCode, operatorId);
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public Response handleRecharge(RechargeDTO dto){
    return service.handleRecharge(dto);
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/pix")
  @Produces(MediaType.APPLICATION_JSON)
  public Response handlePix(PixQrCodeDTO dto) {
    return service.handlePix(dto);
  }
}
