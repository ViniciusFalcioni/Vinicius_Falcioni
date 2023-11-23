package org.acme.Controller;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.model.CalculadoraService;

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
    @Produces(MediaType.TEXT_HTML) // Definir o tipo de mídia para HTML
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public TemplateInstance calculate(@FormParam("numero1") double num1, @FormParam("numero2") double num2,
            @FormParam("option") String operation) {

        CalculadoraService service = new CalculadoraService();
        String resultado = service.metodoCalcular(num1, num2, operation);
        return result.data("resultado", resultado);

    }

}

