package com.fag.model;

import java.text.DecimalFormat;

public class operacoes {

    public operacoes() {}

public static String getOperacao(Float valor1, Float valor2, Character operacao) {
        if (valor1 == null || valor2 == null || operacao == null) {
            return "Por favor, preencha todos os campos!";
        }

        float resultado = 0;

        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;
                break;
            case '-':
                resultado = valor1 - valor2;
                break;
            case 'x':
                resultado = valor1 * valor2;
                break;
            case '/':
                if (valor2 == 0) {
                    return "Não é possível dividir por zero.";
                }
                resultado = valor1 / valor2;
                break;
            default:
                return "Operação inválida!";
        }

        DecimalFormat formato = new DecimalFormat("0.00");
        String resultadoFormatado = formato.format(resultado);

        return resultadoFormatado;
    }
}
