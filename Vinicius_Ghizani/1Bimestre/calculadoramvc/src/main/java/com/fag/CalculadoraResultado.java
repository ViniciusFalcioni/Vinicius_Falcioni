package com.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.BadRequestException;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("/resultado")
public class CalculadoraResultado {

  private final Template resultado;

  public CalculadoraResultado(Template resultado) {
    this.resultado = requireNonNull(resultado, "page is required");
  }

  @GET
  @Produces(MediaType.TEXT_HTML)
  public TemplateInstance get(@QueryParam("valor1") double valor1,
      @QueryParam("valor2") double valor2,
      @QueryParam("operacao") String operacao) {

    double resultadoOperacao = 0.0;

    switch (operacao) {
      case "soma":
        resultadoOperacao = valor1 + valor2;
        break;
      case "subtracao":
        resultadoOperacao = valor1 - valor2;
        break;
      case "multiplicacao":
        resultadoOperacao = valor1 * valor2;
        break;
      case "divisao":
        resultadoOperacao = valor2 != 0 ? valor1 / valor2 : 0;
        break;
      default:
        throw new BadRequestException("Operação inválida!");
    }

    return resultado.instance().data("resultadoOperacao", resultadoOperacao);
  }
}
