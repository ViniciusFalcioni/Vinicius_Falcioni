package org.acme;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("/calculadora")
public class ControladorCalculadora {

    private final Template page;

    public ControladorCalculadora(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("name") String name) {
        return page.data("name", name);
    }

   
    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculadora(@FormParam("primeiroValor") Double primeiroValor,
            @FormParam("segundoValor") Double segundoValor, @FormParam("operacao") String operacao) {
                Valores valores = new Valores();
                switch (operacao){
                    case "adicao": 
                    valores.setResultado(primeiroValor + segundoValor);
                    break;

                    case "subtracao":
                    valores.setResultado(primeiroValor - segundoValor);
                    break;


                    case "multiplicacao":
                    valores.setResultado(primeiroValor * segundoValor);
                    break;


                    case "divisao":
                    valores.setResultado(primeiroValor / segundoValor);
                    break;
                }
                
            return page.data("resultado", valores);
    }

}
