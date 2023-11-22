package com.fag.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fag.dto.EquacaoDTO;
import com.fag.model.EnumOperation;
import com.fag.model.IEnum;
import com.fag.service.CalculadoraService;
import com.fag.service.EquacaoService;

import io.quarkus.qute.CheckedTemplate;
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

@Path("/calculator")
public class CalculadoraResource {

    @Inject
    CalculadoraService calculadoraService;

    @Inject
    EquacaoService equacaoService;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getPage(@QueryParam("name") String name) {
        List<String> operations = Stream.of(EnumOperation.values())
                .map(EnumOperation::getValue)
                .collect(Collectors.toList());

        return Templates.page(name, operations);
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(@FormParam("num1") String num1,
            @FormParam("num2") String num2,
            @FormParam("operation") String operation) {
        BigDecimal value1 = new BigDecimal(num1);
        BigDecimal value2 = new BigDecimal(num2);

        EnumOperation enumOperation = IEnum.findByValue(EnumOperation.class, operation);

        BigDecimal result = calculadoraService.calculate(value1, value2, enumOperation);

        equacaoService.createEquacao(new EquacaoDTO(value1, value2, enumOperation, result));

        return Templates.calculator(result, null);
    }

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance page(String name, List<String> operations);

        public static native TemplateInstance calculator(BigDecimal result, String name);
    }

}