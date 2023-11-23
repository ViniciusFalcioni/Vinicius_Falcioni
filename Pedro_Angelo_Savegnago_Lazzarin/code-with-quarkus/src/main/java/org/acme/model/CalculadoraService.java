package org.acme.model;

public class CalculadoraService {
    public String metodoCalcular(double numero1, double numero2, String option) {
        String resultado;
        switch (option) {
            case "add":
                resultado = "Resultado: " + (numero1 + numero2);
                return resultado;

            case "sub":
                resultado = "Resultado: " + (numero1 - numero2);
                return resultado;

            case "div":
                if (numero2 != 0) {
                    resultado = "Resultado: " + (numero1 / numero2);
                    return resultado;
                } else {
                    resultado = "Impossivel dividir por 0";
                    return resultado;
                }

            case "mult":
                resultado = "Resultado: " + (numero1 * numero2);
                return resultado;

            default:
                resultado = "Escolha uma opção válida";
                return resultado;
        }
    }
}
