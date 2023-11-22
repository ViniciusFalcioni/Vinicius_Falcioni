package com.calculadora.models;

public class CalculadoraModel {

    private Double result;

    public Double calculadora(String operacao, Double valor1, Double valor2) {
        switch (operacao) {
            case "+":
                result = valor1 + valor2;
                break;

            case "-":
                result = valor1 - valor2;
                break;

            case "*":
                result = valor1 * valor2;
                break;

            case "/":
                result = (valor2 != 0) ? valor1 / valor2 : 0;
                break;
                
            default:
                return null;
        }

        return result;
    }
}