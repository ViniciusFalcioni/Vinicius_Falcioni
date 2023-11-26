package com.fag.controller;

import java.util.Objects;
import com.fag.service.CalculadoraService;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator")
public class CalculadoraController {

    private final Template page;

    public CalculadoraController(Template calculator) {
        this.page = Objects.requireNonNull(calculator, "page is required");
    }
       
    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance result(@QueryParam("val1") String val1, @QueryParam("val2") String val2, @QueryParam("operacao")String operacao) {
      
        double result = 0.0;

        if((val1 != null && !val1.isEmpty()) && (val2 != null  && !val2.isEmpty()) && (operacao != null && !operacao.isEmpty())){
            Double Val1 = Double.parseDouble(val1);
            Double Val2 = Double.parseDouble(val2);
            result = CalculadoraService.calcular(Val1, Val2, operacao);    
        }
        
        return page.data("result", result);
        
    }
}



