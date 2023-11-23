package com.fag;

public class CalculatorModel {

    public boolean isValidOperation(String operation) {
        return operation != null && (operation.equals("soma") || operation.equals("subtracao") ||
                                     operation.equals("multiplicacao") || operation.equals("divisao"));
    }

    public boolean isDivisionByZero(double value2, String operation) {
        return operation.equals("divisao") && value2 == 0;
    }
}





















//responsavel por representar os dados, contem os atributos para realizar as operacoes