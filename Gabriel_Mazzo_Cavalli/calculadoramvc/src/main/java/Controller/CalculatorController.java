package Controller;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import model.CalculatorService;

import javax.xml.transform.Templates;

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
    public TemplateInstance calculate(@FormParam("num1") double num1, @FormParam("num2") double num2,
            @FormParam("operation") String operation) {

        CalculatorService service = new CalculatorService();
        String resultado = service.realizarCalculo(operation, num1, num2);
        return result.data("resultado", resultado);

    }

}
