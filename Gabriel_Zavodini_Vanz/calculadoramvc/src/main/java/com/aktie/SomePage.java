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

@Path("/calculadora")
public class SomePage {

    private final Template page;

    public SomePage(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return page.data("name", null);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance post(@FormParam("valor1") Double valor1,
            @FormParam("valor2") Double valor2, @FormParam("operacoes") String operacoes) {
        double resultado = 0d;
        
        
        switch (operacoes) {
            case "Soma":
                resultado = valor1 + valor2;
                break;
            case "Sub":
                resultado = valor1 - valor2;
                break;
            case "mult":
                resultado = valor1 * valor2;
                break;
            case "Div":
                resultado = valor1 / valor2;
                break;
            }
        return page.data("name", resultado);
    }

}