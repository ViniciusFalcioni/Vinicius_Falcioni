package org.acme.controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import static java.util.Objects.requireNonNull;
import org.acme.dto.TemplateDataDTO;
import org.acme.model.CalculadoraModel;

@Path("/calculator")
public class CalculadoraController {

    private final Template page;

    @Inject
    CalculadoraModel calculatorModel;

    private Object resultado;

    @Inject
    public CalculadoraController(Template page, CalculadoraModel calculatorModel) {
        this.page = requireNonNull(page, "page is required");
        this.calculatorModel = requireNonNull(calculatorModel, "calculatorModel is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance retornarTelaInicial() {
        return page.data("name", "Luiz Fernando").data("resultado",
                resultado != null ? resultado : "Aguardando cálculo...");
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(
            @FormParam("numero1") String numero1Str,
            @FormParam("numero2") String numero2Str,
            @FormParam("operacao") String operacao) {
                
        Float numero1 = Float.parseFloat(numero1Str.replace(",", "."));
        Float numero2 = Float.parseFloat(numero2Str.replace(",", "."));

        TemplateDataDTO dto = new TemplateDataDTO();
        String resultado = calculatorModel.realizarCalculo(numero1, numero2, operacao);
        return page.data("name", "Seu Nome Aqui").data("resultado", resultado != null ? resultado : 0.0);
    }
}