package com.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/calculate")
public class CalculatorController {

    @Inject
    Template page;

    @Inject
    CalculatorServices calculatorServices;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance showCalculator() {
        Map<String, Object> data = new HashMap<>();
        data.put("resultado", "");
        data.put("mensagem", "");
        return page.data(data);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public TemplateInstance calculate(@FormParam("value1") double value1,
                                      @FormParam("value2") double value2,
                                      @FormParam("operation") String operation) {
        Map<String, Object> data = new HashMap<>();
        double resultado = 0;
        String mensagem = "";

        CalculatorModel calculatorModel = new CalculatorModel();

        if (!calculatorModel.isValidOperation(operation)) {
            mensagem = "Operação inválida";
        } else if (calculatorModel.isDivisionByZero(value2, operation)) {
            mensagem = "Divisão por zero não é permitida.";
        } else {
            try {
                resultado = calculatorServices.calculate(value1, value2, operation);
            } catch (ArithmeticException e) {
                mensagem = e.getMessage();
            } catch (IllegalArgumentException e) {
                mensagem = e.getMessage();
            }
        }

        data.put("resultado", resultado);
        data.put("mensagem", mensagem);

        return page.data(data);
    }
}





















//recebe requisicoes do usuario e retorna resultado