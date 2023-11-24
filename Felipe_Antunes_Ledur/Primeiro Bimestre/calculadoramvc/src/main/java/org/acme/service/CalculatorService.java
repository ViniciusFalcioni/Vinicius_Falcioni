package org.acme.service;

public class CalculatorService {
    public float calcularResultado(float num1, float num2, Integer operacao) {
        float resultado = 0;
        if (operacao == 1) {
            resultado = num1 + num2;
        } else if (operacao == 2) {
            resultado = num1 - num2;
        } else if (operacao == 3) {
            resultado = num1 * num2;
        } else if (operacao == 4) {
           
            resultado = num1 / num2;
        }
        return resultado;
    }
}
