package org.acme.controllers;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.services.CalculatorService;

import java.math.BigDecimal;
import java.util.ArrayList;

import static java.util.Objects.requireNonNull;

@Path("/result")
@Consumes(MediaType.TEXT_HTML)
@Produces(MediaType.TEXT_HTML)
public class Calculator {
    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance page(String name, ArrayList<String> operacoes);

        public static native TemplateInstance result(BigDecimal result);
    }

    @Inject
    CalculatorService service;

    @GET
    public TemplateInstance get(@QueryParam("name") String name) {
        //ArrayList das operações matemáticas
        ArrayList<String> operacoes = new ArrayList<String>();
        operacoes.add("Adicão");
        operacoes.add("Subtracão");
        operacoes.add("Divisão");
        operacoes.add("Multiplicação");

        return Templates.page(name, operacoes);
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
     public TemplateInstance calculate(@FormParam("first-alg") String firstNumber, @FormParam("second-alg") String secondNumber,
                               @FormParam("operacao") String operacao) {

        BigDecimal firstAlg = new BigDecimal(firstNumber);
        BigDecimal secondAlg = new BigDecimal(secondNumber);



        BigDecimal result = service.calculate(operacao, firstAlg, secondAlg);

        return Templates.result(result);
    }
}
