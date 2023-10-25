package org.flavio.quarkus.service;


import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ApplicationScoped
public class FlavioCalculatorService {

    public String calcular(String expressao) {
        try {
            expressao = expressao.replaceAll("\\s+", "");
            if (!expressaoValida(expressao)) {
                throw new IllegalArgumentException("Expressão inválida");
            }
            Matcher matcher = Pattern.compile("[+\\-*/]").matcher(expressao);

            List<String> operatorsList = new ArrayList<>();
            while (matcher.find()) {
                operatorsList.add(matcher.group());
            }

            String[] numbers = expressao.split("[+\\-*/]");
            List<String> numbersList = new ArrayList<>(List.of(numbers));

            fazerCalculos(operatorsList, numbersList, "*/");
            fazerCalculos(operatorsList, numbersList, "+-");

            double result = Double.parseDouble(numbersList.get(0));

            return String.valueOf(result);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            return "Erro ao calcular.";
        }
    }

    private boolean expressaoValida(String expressao) {
        return Pattern.matches("[0-9+\\-*/.]+", expressao);
    }

    private void fazerCalculos(List<String> operadores, List<String> operandos, String operadoresParaProcessar) {
        for (int i = 0; i < operadores.size(); i++) {
            if (operadoresParaProcessar.contains(operadores.get(i))) {
                double num1 = Double.parseDouble(operandos.get(i));
                double num2 = Double.parseDouble(operandos.get(i + 1));
                String operator = operadores.get(i);

                double result = switch (operator) {
                    case "*" -> num1 * num2;
                    case "/" -> num1 / num2;
                    case "+" -> num1 + num2;
                    default -> num1 - num2;
                };
                operandos.set(i, Double.toString(result));
                operadores.remove(i);
                operandos.remove(i + 1);
                i--;
            }
        }
    }
}
