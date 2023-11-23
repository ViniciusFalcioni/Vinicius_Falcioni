import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

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
    @Produces(MediaType.TEXT_HTML) // Definir o tipo de mídia para HTML
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public TemplateInstance calculate(@FormParam("num1") double num1, @FormParam("num2") double num2,
            @FormParam("operation") String operation) {
        String resultMessage;
        switch (operation) {
            case "add":
                resultMessage = "Resultado da adição: " + (num1 + num2);
                break;
            case "subtract":
                resultMessage = "Resultado da subtração: " + (num1 - num2);
                break;
            case "multiply":
                resultMessage = "Resultado da multiplicação: " + (num1 * num2);
                break;
            case "divide":
                if (num2 != 0) {
                    double divisionResult = (double) num1 / num2;
                    resultMessage = "Resultado da divisão: " + divisionResult;
                } else {
                    resultMessage = "Não é possível dividir por zero.";
                }
                break;
            default:
                resultMessage = "Operação inválida.";
                break;
        }

        return result.data("result", resultMessage);

    }
}
