package org.flavio.quarkus.resource;

import jakarta.inject.Inject;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.flavio.quarkus.service.FlavioCalculatorService;


@Path("/")
public class CalculadoraResource {

    @Inject
    FlavioCalculatorService flavioCalculatorService;

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance calculadora(String result);
    }

    @POST
    @Path("/calcular")
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public TemplateInstance calculate(@FormParam("expressao") String expressao) {
        return Templates.calculadora(flavioCalculatorService.calcular(expressao));
    }

    @GET
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance home() {
        return Templates.calculadora("");
    }
}
