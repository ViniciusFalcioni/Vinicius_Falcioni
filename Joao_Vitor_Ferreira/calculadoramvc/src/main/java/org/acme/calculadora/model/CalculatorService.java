package org.acme.calculadora.model;

public class CalculatorService {
    private double num1;
    private double num2;
    private String operation;

    public String calcularResultado() {
        switch (operation) {
            case "add":
                return "Resultado da adição: " + (num1 + num2);
            case "subtract":
                return "Resultado da subtração: " + (num1 - num2);
            case "multiply":
                return "Resultado da multiplicação: " + (num1 * num2);
            case "divide":
                if (num2 != 0) {
                    double divisionResult = (double) num1 / num2;
                    return "Resultado da divisão: " + divisionResult;
                } else {
                    return "Não é possível dividir por zero.";
                }
            default:
                return "Operação inválida.";
        }
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperation() {
        return operation;
    }

    public String getResultMessage() {
        return null;
    }
}