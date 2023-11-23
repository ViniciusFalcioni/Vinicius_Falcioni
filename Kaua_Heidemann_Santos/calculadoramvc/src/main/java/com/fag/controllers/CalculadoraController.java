package com.fag.controllers;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

import java.util.HashMap;
import java.util.Map;

import com.fag.services.CalculadoraService;

@Path("/calculadora")
public class CalculadoraController {

    private final Template calculadora;

    public CalculadoraController(Template calculadora) {
        this.calculadora = requireNonNull(calculadora, "calculadora is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("val1") Double val1, @QueryParam("val2") Double val2) {

        // Double result = val1 + val2;
        return calculadora.data("result", null);
    }

    @Inject
    CalculadoraService service;

    @POST
    @Path("/result")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance result(@FormParam("valor1") Double valor1, @FormParam("valor2") Double valor2, 
    @FormParam("operacao") String operacao) {

        Double result = 0.0;

        result = service.retornarResultado(valor1, valor2, operacao);

        Map<String, Object> valorRetornado = new HashMap<>();
        valorRetornado.put("result", result);

        return calculadora.data(valorRetornado);
    }

    public String name(String name) {
        return "hello" + name;
    }
}
