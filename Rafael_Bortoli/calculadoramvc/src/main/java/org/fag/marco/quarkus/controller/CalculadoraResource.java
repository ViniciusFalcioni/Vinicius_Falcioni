package org.fag.marco.quarkus.controller;

import jakarta.inject.Inject;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.fag.marco.quarkus.service.CalculadoraService;


@Path("/")
public class CalculadoraResource {

    @Inject
    CalculadoraService calculadoraService;

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance calculadora(String result);
    }

    @POST
    @Path("/calculate")
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public TemplateInstance calculate(@FormParam("expression") String expression) {
        return Templates.calculadora(calculadoraService.calculate(expression));
    }

    @GET
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance home() {
        return Templates.calculadora("");
    }
}
