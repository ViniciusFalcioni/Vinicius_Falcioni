package com.fag;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculatorServices {

    public double calculate(double value1, double value2, String operation) {
        switch (operation) {
            case "soma":
                return value1 + value2;
            case "subtracao":
                return value1 - value2;
            case "multiplicacao":
                return value1 * value2;
            case "divisao":
                if (value2 != 0) {
                    return value1 / value2;
                } else {
                    throw new ArithmeticException("Divisão por zero não é permitida.");
                }
            default:
                throw new IllegalArgumentException("Operação inválida");
        }
    }
}














//recebe chamadas do banco