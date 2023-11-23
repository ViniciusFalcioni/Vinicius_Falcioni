package edu.fag.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculatorService {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) { throw new ArithmeticException("Divisão por zero não é permitida."); }
        return num1 / num2;
    }

    public double percent(double num1, double num2) {
        return (num1 * num2) / 100;
    }
}
