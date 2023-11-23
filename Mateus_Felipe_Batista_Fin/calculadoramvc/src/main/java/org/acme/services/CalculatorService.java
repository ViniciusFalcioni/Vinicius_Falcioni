package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import org.acme.controllers.Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

@ApplicationScoped
public class CalculatorService {

    public BigDecimal calculate(String operacao, BigDecimal firstAlg, BigDecimal secondAlg) {
        switch (operacao) {
            case "Adicão":
                return firstAlg.add(secondAlg);
            case "Subtracão":
                return firstAlg.subtract(secondAlg);
            case "Divisão":

                if (secondAlg.equals(BigDecimal.ZERO)) {
                    throw new ArithmeticException("Erro! Não pode ser dividído por zero");
                }

                return firstAlg.divide(secondAlg, RoundingMode.HALF_UP);
            case "Multiplicação":
                return firstAlg.multiply(secondAlg);
            default:
                return BigDecimal.ZERO;
        }
    }
}
