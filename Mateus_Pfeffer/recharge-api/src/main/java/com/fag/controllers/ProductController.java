package com.fag.controllers;

import com.fag.domain.dto.ProductDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductController {

    @GET
    public Response listProducts() {
        return Response.ok().build();
    }

    @GET
    @Path("/{id}")
    public Response getProduct(@PathParam("id") String productId) {
        return Response.ok().build();
    }

    @POST
    public Response createProduct(ProductDTO dto) {
        return Response.ok().build();
    }

    @PUT
    @Path("/{id}")
    public Response updateProduct(@PathParam("id") String productId) {
        return Response.ok().build();
    }

}
