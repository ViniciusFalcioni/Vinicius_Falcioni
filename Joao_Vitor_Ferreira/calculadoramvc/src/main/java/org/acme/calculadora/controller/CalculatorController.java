package org.acme.calculadora.controller;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.acme.calculadora.model.CalculatorService;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.inject.Inject;

@Path("/calculator")
public class CalculatorController {

    @Inject
    Template calculator;

    @Inject
    Template result;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculatorPage() {
        return calculator.instance();
    }

    @POST
    @Path("/calculate")
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public TemplateInstance calculate(@FormParam("num1") double num1, @FormParam("num2") double num2,
            @FormParam("operation") String operation) {
        CalculatorService model = new CalculatorService();
        model.setNum1(num1);
        model.setNum2(num2);
        model.setOperation(operation);

        String calcularResultado = model.calcularResultado();

        return result.data("result", calcularResultado);
    }
}