package com.calculator.controller;

import com.calculator.model.Enum;
import com.calculator.service.CalculatorService;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.stream.Collectors;

@Consumes(MediaType.TEXT_HTML)
@Produces(MediaType.TEXT_HTML)
@Path("/")
public class CalculatorController {

    @Inject
    Template index;

    @Inject
    Template calculadora;

    @GET
    public TemplateInstance get() {
        var arithmeticOperations = Arrays.asList(Enum.values())
                .stream()
                .map(Enum::getOption)
                .collect(Collectors.toList());

        return index.data("name", "Ghenoninho", "arithmeticOperations", arithmeticOperations);
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    public TemplateInstance post(@FormParam("primeiroValor") Float primeiro, @FormParam("segundoValor") Float segundo, @FormParam("selectCalculadora") Integer operation) {

        CalculatorService service = new CalculatorService();

        Float result = service.calculate(primeiro, segundo, operation);

        return calculadora.data("name", "Resultado", "result", result);


    }

}