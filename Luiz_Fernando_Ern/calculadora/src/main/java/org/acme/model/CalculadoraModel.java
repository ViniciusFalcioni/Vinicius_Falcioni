package org.acme.model;

import java.text.DecimalFormat;

import jakarta.inject.Singleton;

@Singleton
public class CalculadoraModel {

    private static Float resultado;

    public String realizarCalculo(Float numero1, Float numero2, String operacao) {
        switch (operacao) {
            case "soma": {
                resultado = numero1 + numero2;
            }
                break;
            case ("subtracao"): {
                resultado = numero1 - numero2;
            }
                break;
            case ("multiplicacao"): {
                resultado = numero1 * numero2;
            }
                break;
            case ("divisao"): {
                try {
                    if (numero2 == 0) {
                        throw new ArithmeticException("Divisão por zero não é permitida.");
                    }
                    resultado = numero1 / numero2;
                } catch (Exception e) {
                    return String.format("O divisor não pode ser zero!");
                }
            }
        }
        DecimalFormat df = new DecimalFormat("0.###");
        return df.format(resultado);
    }
}
