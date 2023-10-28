package org.trabalhoQuarkus.Controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;
import org.trabalhoQuarkus.Model.OpcaoSelect;

@Path("/Calculadora")
public class SomePage {

    @Inject
    Template Calculadora;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance Calculadora(@QueryParam String param) {
        List<OpcaoSelect> operacao = new ArrayList<OpcaoSelect>();
        operacao.add(new OpcaoSelect("soma", "Soma"));
        operacao.add(new OpcaoSelect("subtracao", "Subtração"));
        operacao.add(new OpcaoSelect("multiplicacao", "Multiplicação"));
        operacao.add(new OpcaoSelect("divisao", "Divisão"));

        return Calculadora.data("operacao", "operacao");
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance post(
            @FormParam("operacao") String operacao,
            @FormParam("n1") Double n1,
            @FormParam("n2") Double n2) {
        Double result = 0.0;
        String mensagem = "";
        switch (operacao) {
            case "soma":
                result = n1 + n2;
                break;
            case "subtracao":
                result = n1 - n2;
                break;
            case "multiplicacao":
                result = n1 * n2;
                break;
            case "divisao":
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    mensagem ="ERRO! Não pode dividir por 0!";
                }
                break;
            default:
                break;
        }
        return Calculadora.data("result",(mensagem.isEmpty())? result:mensagem);
    }

}