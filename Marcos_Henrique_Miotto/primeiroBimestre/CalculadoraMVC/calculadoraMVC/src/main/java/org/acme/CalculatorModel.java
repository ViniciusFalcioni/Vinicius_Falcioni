package org.acme;

import jakarta.json.bind.annotation.JsonbProperty;

public class CalculatorModel {
    @JsonbProperty("firstNumber")
    private double firstNumber;
    @JsonbProperty("secondNumber")
    private double secondNumber;
    @JsonbProperty("operation")
    private String operation;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
