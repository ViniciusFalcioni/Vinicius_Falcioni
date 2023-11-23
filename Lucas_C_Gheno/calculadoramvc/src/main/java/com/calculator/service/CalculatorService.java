package com.calculator.service;

public class CalculatorService {
    public Float calculate(Float primeiro, Float segundo, Integer operation) {
        switch(operation) {
            case 1:
                return primeiro + segundo;

            case 2:
                return primeiro - segundo;

            case 3:
                return primeiro * segundo;

            case 4:
                if(segundo == 0) {
                    throw new ArithmeticException("Não da pra dividir por zero maninho");
                }
                return primeiro / segundo;
        }

        return 0f;
    }
}