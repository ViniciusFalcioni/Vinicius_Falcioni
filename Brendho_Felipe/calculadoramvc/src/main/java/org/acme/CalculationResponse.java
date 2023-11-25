package org.acme;

public class CalculationResponse {
    private double result;

    public CalculationResponse() {
    }

    public CalculationResponse(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
