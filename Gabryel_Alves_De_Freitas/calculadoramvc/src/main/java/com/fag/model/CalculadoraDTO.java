package com.fag.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraDTO {

    public CalculadoraDTO(){}

    public static BigDecimal getResultado(BigDecimal valor1, BigDecimal valor2, OperacaoEnum operacao){
        BigDecimal resultado = BigDecimal.ZERO;
            switch(operacao){
            case Soma:
                resultado = valor1.add(valor2).setScale(2, RoundingMode.HALF_UP);
                break;
            case Subtracao:
                resultado = valor1.subtract(valor2).setScale(2, RoundingMode.HALF_UP);
                break;
            case Divisao:
                resultado = valor1.divide(valor2, RoundingMode.HALF_UP).setScale(2, RoundingMode.HALF_UP);
                break;
            case Multiplicacao:
                resultado = valor1.multiply(valor2).setScale(2, RoundingMode.HALF_UP);
                break;
            default:
                resultado = BigDecimal.ZERO;
            }
        
        return resultado;
    }
    
}