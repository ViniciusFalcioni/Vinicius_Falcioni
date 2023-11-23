package com.fag.Controllers;
import com.fag.model.CalculatorModel;
import com.fag.services.CalculatorService;
import com.fag.enums.EnumUserOption;
import java.math.BigDecimal;

import java.util.List;
import java.util.stream.Collectors;
import org.jboss.resteasy.annotations.jaxrs.FormParam;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator")
@Consumes(MediaType.TEXT_HTML)
@Produces(MediaType.TEXT_HTML)
public class CalculatorController {

    @Inject
    CalculatorService calculatorService;

    @Inject
    Template calculator;

    @Inject
    Template result;
    
    @GET
    public TemplateInstance get(@QueryParam("name") String name) {
        List<String> arithmeticOperations = List.of(EnumUserOption.values()).stream()
                .map(e -> e.getValue()).collect(Collectors.toList());
        return calculator.data("name", name).data("arithmeticOperations", arithmeticOperations);
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(@FormParam("num1") double num1,
                                      @FormParam("num2") double num2,
                                      @FormParam("operation") String operation) {
    
        if (operation.equals("dividido") && num2 == 0) {
            // Tratar divisão por zero aqui
            return result.data("calculatorModel", null).data("error", "Não é possível dividir por zero.");
        } else {
            double resultValue = calculatorService.calculate(num1, num2, operation);
            CalculatorModel calculatorModel = new CalculatorModel();
            calculatorModel.setNum1(BigDecimal.valueOf(num1));
            calculatorModel.setNum2(BigDecimal.valueOf(num2));
            calculatorModel.setOperation(operation);
            calculatorModel.setResult(BigDecimal.valueOf(resultValue));
    
            return result.data("calculatorModel", calculatorModel).data("error", null);
        }
    }
    
}
