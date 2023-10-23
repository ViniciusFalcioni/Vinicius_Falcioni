package com.fag.controllers;
import static java.util.Objects.requireNonNull;

import com.fag.model.operacoes;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/calculadora")
public class calculadora {

    private final Template page;

    public calculadora(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(
            @QueryParam("valor1") Float valor1,
            @QueryParam("valor2") Float valor2,
            @QueryParam("operacao") Character operacao) {

        return page.data("name", operacoes.getOperacao(valor1, valor2, operacao));
    }
}
