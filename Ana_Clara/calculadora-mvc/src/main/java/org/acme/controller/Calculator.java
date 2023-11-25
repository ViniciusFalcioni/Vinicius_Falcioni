package org.acme.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.acme.model.EnumUserOption;
import org.acme.services.CalculatorService;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/home")
@Consumes(MediaType.TEXT_HTML)
@Produces(MediaType.TEXT_HTML)
public class Calculator {
@Inject
  Template page;

  @Inject
  Template calculator;


  @GET
  public TemplateInstance get(@QueryParam("name") String name) {
    List<EnumUserOption> arithmeticOperations = List.of(EnumUserOption.values()).stream()
    .map(e -> e.getOperations())
    .collect(Collectors.toList());

    return page.data("name", name, "arithmeticOperations", arithmeticOperations);
  }

  @POST
  @Consumes("application/x-www-form-urlencoded")
  public TemplateInstance post(@FormParam("selection") int operation, @FormParam("primeiroValor") float primeiroValor, @FormParam("segundoValor") float segundoValor) {
    
    CalculatorService service = new CalculatorService();

    String result = "";
    
    try {
      result = service.calculate(primeiroValor, segundoValor, operation).toString();
    } catch (Exception e) {
      result = e.getMessage();
    }

    return calculator.data("result", result);
  }
}
