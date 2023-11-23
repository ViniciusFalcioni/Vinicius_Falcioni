package com.fag.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculadoraService {

    public Double retornarResultado(Double valor1, Double valor2, String operacao) {
        switch(operacao) {
            case "Adição":
                return valor1 + valor2;

            case "Subtração":
                return valor1 - valor2;

            case "Multiplicação":
                return valor1 * valor2;

            case "Divisão":
                return valor1 / valor2;

            default:
                return null;
        }
    }
}

