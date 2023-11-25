package br.com.fag.controller;

import java.util.List;
import java.util.stream.Collectors;

import br.com.fag.model.Operacoes;
import br.com.fag.service.CalculadoraService;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Consumes(MediaType.TEXT_HTML)
@Produces(MediaType.TEXT_HTML)
@Path("/")
public class CalculadoraController {
  
  @Inject
  Template index;

  @Inject
  Template calculadora;

  @GET
  public TemplateInstance get() {
    List<Operacoes> operacoes = List.of(Operacoes.values())
      .stream()
      .map(e -> e.getOption())
      .collect(Collectors.toList());
    
    return index.data("name", "Guilherme Perinotti", "operacoes", operacoes);
  }

  @POST
  @Consumes("application/x-www-form-urlencoded")
  public TemplateInstance post(@FormParam("primeiroValor") Float primeiro, @FormParam("segundoValor") Float segundo, @FormParam("selectCalculadora") Integer opcao) {

    CalculadoraService calculadoraService = new CalculadoraService();
    Operacoes operation = Operacoes.values()[opcao - 1];

    String result = "";
    try {
      result = calculadoraService.calcular(primeiro, segundo, operation).toString();
    } catch (Exception e) {
      result = e.getMessage();
    }
    
    return calculadora.data("result", result);
  }

}
