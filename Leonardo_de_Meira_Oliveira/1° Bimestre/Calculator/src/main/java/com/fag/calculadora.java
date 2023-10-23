package com.fag;

import static java.util.Objects.requireNonNull;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/calculadora")
public class calculadora {

    private final Template page;

    public calculadora(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(
            @QueryParam("valor1") Float valor1,
            @QueryParam("valor2") Float valor2,
            @QueryParam("operacao") Character operacao) {
        if (valor1 == null || valor2 == null || operacao == null) {
            return page.data("name", "Por favor, preencha todos os campos.");
        }

        float resultado = 0;
        if (operacao == '/') {
            if (valor2 == 0) {
                return page.data("name", "Não é possível dividir por zero.");
            }
            resultado = valor1 / valor2;
        } else {
            switch (operacao) {
                case '+':
                    resultado = valor1 + valor2;
                    break;
                case '-':
                    resultado = valor1 - valor2;
                    break;
                case 'x':
                    resultado = valor1 * valor2;
                    break;
            }
        }
        return page.data("name", resultado);
    }
}
