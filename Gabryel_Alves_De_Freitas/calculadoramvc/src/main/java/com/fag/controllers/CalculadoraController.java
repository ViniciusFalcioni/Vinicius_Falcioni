package com.fag.controllers;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

import java.math.BigDecimal;
import java.util.List;

import com.fag.model.CalculadoraDTO;
import com.fag.model.OperacaoEnum;

@Path("/calculadora")
public class CalculadoraController {

    private final Template calculadora;

    public CalculadoraController(Template calculadora) {
        this.calculadora = requireNonNull(calculadora, "page is required");
    }
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getResultado(@QueryParam("valor1") String valor1, @QueryParam("valor2") String valor2, @QueryParam("operacao") String operacao) {
        BigDecimal resultado = BigDecimal.ZERO;

        if((valor1 != null && !valor1.isEmpty()) && (valor2 != null && !valor2.isEmpty()) && (operacao != null && !operacao.isEmpty())){
            BigDecimal valor1BigDecimal = BigDecimal.valueOf(Double.parseDouble(valor1));
            BigDecimal valor2BigDecimal = BigDecimal.valueOf(Double.parseDouble(valor2));
            OperacaoEnum operacaoEnum = List.of(OperacaoEnum.values()).stream().filter(x -> x.getDescricao().equals(operacao)).findFirst().orElse(OperacaoEnum.Soma);

            if(operacaoEnum.equals(OperacaoEnum.Divisao) && valor2.equals("0"))
                resultado = BigDecimal.ZERO;
            else
                resultado = CalculadoraDTO.getResultado(valor1BigDecimal, valor2BigDecimal, operacaoEnum);            
        }

        return calculadora.data("resultado", resultado);
    }   
}
