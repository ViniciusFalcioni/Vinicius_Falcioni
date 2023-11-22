package org.acme;

public class CalculatorResponse {

    private double result;
    private String message;

    // Construtores
    public CalculatorResponse() {
    }

    public CalculatorResponse(double result) {
        this.result = result;
    }

    public CalculatorResponse(String message) {
        this.message = message;
    }

    // Getters e setters
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
