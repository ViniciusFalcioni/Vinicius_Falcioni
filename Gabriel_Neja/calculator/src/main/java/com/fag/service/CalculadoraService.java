package com.fag.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculadoraService {
    
    public static Double calcular(double val1, double val2, String operacao) {
        
        switch (operacao) {
            case "soma":
                return val1 + val2;
            case "subtracao":
                return val1 - val2;
            case "multiplicacao":
                return val1 * val2;
            case "divisao":
                if (val2 != 0) {
                    return val1 / val2;
                } else {
                    throw new IllegalArgumentException("Divisão por zero não é permitida.");
                }
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
    }
    
}

