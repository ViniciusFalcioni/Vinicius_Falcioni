package com.fag.services;

import jakarta.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
public class CalculatorService {
    public double calculate(double num1, double num2, String operation) {
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal bigNum1 = BigDecimal.valueOf(num1);
        BigDecimal bigNum2 = BigDecimal.valueOf(num2);

        switch (operation) {
            case "adicionado":
                result = bigNum1.add(bigNum2);
                break;
            case "subtraido":
                result = bigNum1.subtract(bigNum2);
                break;
            case "multiplicado":
                result = bigNum1.multiply(bigNum2);
                break;
            case "dividido":
                    result = bigNum1.divide(bigNum2, BigDecimal.ROUND_HALF_UP);
                break;
        }

        return result.doubleValue();
    }
}
