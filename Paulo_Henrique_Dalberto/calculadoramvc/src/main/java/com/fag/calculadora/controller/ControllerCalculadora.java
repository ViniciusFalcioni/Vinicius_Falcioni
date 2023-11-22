package com.fag.calculadora.controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import com.fag.calculadora.dto.TemplateDTO;
import com.fag.calculadora.model.ModelCalculadora;

@Path("/calculadora")
public class ControllerCalculadora {

    private final Template page;
    private final ModelCalculadora modelCalculadora;

    @Inject
    public ControllerCalculadora(Template page, ModelCalculadora modelCalculadora) {
        this.page = page;
        this.modelCalculadora = modelCalculadora;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance retornarTelaInicial() {
        return page.data("mensagemErro", null).data("Resultado", null);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(
        @FormParam("valor1") Float valor1,
        @FormParam("valor2") Float valor2,
        @FormParam("opcao") String opcao) {

        TemplateDTO dto = new TemplateDTO();
        Object resultadoOuErro = modelCalculadora.calcularResultado(valor1, valor2, opcao);
        
        if (resultadoOuErro instanceof Float) {
            Float resultado = (Float) resultadoOuErro;
            dto.setResultado(resultado);
        } else if (resultadoOuErro instanceof String) {
            String mensagemErro = (String) resultadoOuErro;
            dto.setMensagemErro(mensagemErro);
        }

        return page.data("resultado", dto.getResultado()).data("mensagemErro", dto.getMensagemErro());
    }
}
