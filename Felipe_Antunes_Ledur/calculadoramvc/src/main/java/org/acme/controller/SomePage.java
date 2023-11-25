package org.acme.controller;

import org.acme.model.EnumUserOption;
import  org.acme.service.CalculatorService;
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
public class SomePage {

    @Inject
    Template index;

    @Inject
    Template resultado;

    @GET
    public TemplateInstance get() {
        var arithmeticOperations = Arrays.asList(org.acme.model.EnumUserOption.values())
                .stream()
                .map(EnumUserOption::getOption)
                .collect(Collectors.toList());

        return index.data("name", "Calculadora", "arithmeticOperations", arithmeticOperations);
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    public TemplateInstance post(@FormParam("input1") Float num1, @FormParam("input2") Float num2, @FormParam("selectCalculadora") Integer operacao) {

        CalculatorService calculate = new CalculatorService();

        Float result = calculate.calcularResultado(num1, num2, operacao);

        return resultado.data("name", "Resultado", "result", result);


    }

}
