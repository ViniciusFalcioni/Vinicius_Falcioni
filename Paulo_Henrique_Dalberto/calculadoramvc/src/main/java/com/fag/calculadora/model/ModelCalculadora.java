package com.fag.calculadora.model;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ModelCalculadora {
    
    public Object calcularResultado(Float  valor1, Float  valor2, String opcao) {
        Float  resultado = null;
        String mensagemErro = null;

        switch (opcao) {
            case "SOMA":
                resultado = valor1 + valor2;
                break;
            case "SUBTRAÇÃO":
                resultado = valor1 - valor2;
                break;
            case "DIVISÃO":
                if (valor2 == 0) {
                    mensagemErro = "Não é possível dividir por zero";
                } else {
                    resultado = valor1 / valor2;
                }
                break;
            case "MULTIPLICAÇÃO":
                resultado = valor1 * valor2;
                break;
            default:
                break;
        }

        return mensagemErro != null ? mensagemErro : resultado;
    }
}
