package br.fag.controllers;
import br.fag.model.Resultado;
import br.fag.services.Divisao;
import br.fag.services.Multiplicacao;
import br.fag.services.Somar;
import br.fag.services.Substracao;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;


@Path("/calculate")
public class CalculatorResource {
    @GET
    public Response calculate(@QueryParam("first") float first, @QueryParam("second") float second, @QueryParam("operator") String operator){
        Divisao divisao = new Divisao();
        Somar somar = new Somar();
        Substracao substracao = new Substracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Resultado resultado;
        switch (operator) {
            case "+" -> resultado = new Resultado(somar.operacao(first, second));
            case "-" -> resultado = new Resultado(substracao.operacao(first,second));
            case "*" -> resultado = new Resultado(multiplicacao.operacao(first,second));
            case "/" -> resultado = divisao.operacao((int)first, (int)second);
            default -> {
                return Response.status(Response.Status.BAD_REQUEST).entity("Invalid operator").build();
            }
        }
        if (resultado.temErro()) {
            return Response.status(Response.Status.BAD_REQUEST).entity(resultado.mensagemErro).build();
        }

        return Response.ok(String.valueOf(resultado.valor)).build();
    }
}
