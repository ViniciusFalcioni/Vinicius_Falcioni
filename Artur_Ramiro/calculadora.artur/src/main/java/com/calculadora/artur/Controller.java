package com.calculadora.artur;

import static java.util.Objects.requireNonNull;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/calculadora")
public class Controller {

    private final Template page;

    public Controller(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("name") String name) {
        return page.data("name", null);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(
            @FormParam("valor1") Double valor1,
            @FormParam("valor2") Double valor2,
            @FormParam("opcao") String opcao) {
        TemplateDataDto dto = new TemplateDataDto();
       
        switch (opcao) {
            case "Soma":
                dto.setResultado((valor1) + (valor2));
                break;
            case "Subtração":
                dto.setResultado(valor1 - valor2);
                break;
            case "Multiplicação":
                dto.setResultado((valor1) * (valor2));
                break;
            case "Divisão":
             if (valor2 == 0) {
                dto.setResultado(Double.NaN); 
            } else {
                dto.setResultado(valor1 / valor2);
            }           
                break;
        }
        
        return page.data("resultado", dto);
    }
}
