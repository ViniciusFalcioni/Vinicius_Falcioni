package com.fag.service;

import com.fag.model.EnumOperation;
import jakarta.enterprise.context.ApplicationScoped;

import java.math.BigDecimal;
import java.math.RoundingMode;

@ApplicationScoped
public class CalculadoraService {

    public BigDecimal calculate(BigDecimal num1, BigDecimal num2, EnumOperation operation) {
        boolean isValidEquation = this.validateEquation(num2, operation);

        if (!isValidEquation) {
            BigDecimal result = switch (operation) {
                case ADICAO -> num1.add(num2);
                case SUBTRACAO -> num1.subtract(num2);
                case MULTIPLICACAO -> num1.multiply(num2);
                case DIVISAO -> num1.divide(num2, 2, RoundingMode.HALF_UP);
            };

            return result.setScale(2, RoundingMode.HALF_UP);
        } else {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
    }

    public boolean validateEquation(BigDecimal num2, EnumOperation operation) {
        return num2.equals(BigDecimal.ZERO) && operation.equals(EnumOperation.DIVISAO);
    }

}
