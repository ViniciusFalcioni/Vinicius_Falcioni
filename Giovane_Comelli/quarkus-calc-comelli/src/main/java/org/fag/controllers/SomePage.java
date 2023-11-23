package org.fag.controllers;
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

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;
import java.util.Arrays;

import org.fag.services.CalcService;

@Path("/main")
public class SomePage {

    @Inject
    Template page;

    @Inject
    Template result;

    @Inject
    Template error;
    
    public SomePage(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("name") String name) {
        String[] data = {"*", "/", "+", "-"};
        ArrayList<String> operations = new ArrayList<String>(Arrays.asList(data));
        return page.data("operations", operations);
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    public TemplateInstance post(@FormParam("primeiroValor") Float first, @FormParam("segundoValor") Float second, @FormParam("selectCalculadora") String operation) {

        CalcService service = new CalcService();
        Float resultado;
        try {
            resultado = service.calculate(first, second, operation);
        } catch (Exception e) {
            return error.data("");
        }

        return result.data("result", resultado);
    }

}
