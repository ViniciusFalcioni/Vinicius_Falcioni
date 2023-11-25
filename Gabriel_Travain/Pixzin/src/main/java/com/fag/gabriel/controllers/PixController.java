package com.fag.gabriel.controllers;

import com.fag.gabriel.domain.usecases.ICreatePixReq;
import com.fag.gabriel.services.CreatePix;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class PixController {
  @Inject
  CreatePix service;
  
  @GET
  @Transactional
  @Produces(MediaType.TEXT_PLAIN)
  public String handle(
        @HeaderParam("pix") String pix,
        @HeaderParam("value") Double value
    ) {
        System.out.println("value is " + value);
        System.out.println("pix is " + pix);
        return service.createPix(new ICreatePixReq(pix, value));
    }
}
