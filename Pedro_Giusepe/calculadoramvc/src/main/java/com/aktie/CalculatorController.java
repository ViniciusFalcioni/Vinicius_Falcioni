package com.aktie;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("/calculator")
public class CalculatorController {

    private final Template page;

    public CalculatorController(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return page.data("name", null);
    }

@POST
@Produces(MediaType.TEXT_HTML)
public TemplateInstance post(@FormParam("num1") Double num1, 
    @FormParam("num2") Double num2, @FormParam("operation") String operation) {
    double resultado = 0d;
    String errorMessage = null;

    if (num2 == 0 && "Div".equals(operation)) {
        errorMessage = "Erro ao dividir por zero";
    } else {
        switch (operation) {
            case "Soma":
                resultado = num1 + num2;
                break;
            case "Sub":
                resultado = num1 - num2;
                break;
            case "Mult":
                resultado = num1 * num2;
                break;
            case "Div":
                resultado = num1 / num2;
                break;
            default:
                errorMessage = "Operação não suportada";
                break;
        }
    }

    return page.data("name", errorMessage != null ? errorMessage : resultado);
 }}
