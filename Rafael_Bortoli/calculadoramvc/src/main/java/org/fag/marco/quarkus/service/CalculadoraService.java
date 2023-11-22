package org.fag.marco.quarkus.service;


import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ApplicationScoped
public class CalculadoraService {

    public String calculate(String expression) {
        try {
            expression = expression.replaceAll("\\s+", "");
            if (!isValidExpression(expression)) {
                throw new IllegalArgumentException("Invalid expression");
            }
            Matcher matcher = Pattern.compile("[+\\-*/]").matcher(expression);

            List<String> operatorsList = new ArrayList<>();
            while (matcher.find()) {
                operatorsList.add(matcher.group());
            }

            String[] numbers = expression.split("[+\\-*/]");
            List<String> numbersList = new ArrayList<>(List.of(numbers));

            performCalculations(operatorsList, numbersList, "*/");
            performCalculations(operatorsList, numbersList, "+-");

            double result = Double.parseDouble(numbersList.get(0));

            return String.valueOf(result);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            return "Erro ao calcular.";
        }
    }

    private boolean isValidExpression(String expression) {
        return Pattern.matches("[0-9+\\-*/.]+", expression);
    }

    private void performCalculations(List<String> operators, List<String> operands, String operatorsToProcess) {
        for (int i = 0; i < operators.size(); i++) {
            if (operatorsToProcess.contains(operators.get(i))) {
                double num1 = Double.parseDouble(operands.get(i));
                double num2 = Double.parseDouble(operands.get(i + 1));
                String operator = operators.get(i);

                double result = switch (operator) {
                    case "*" -> num1 * num2;
                    case "/" -> num1 / num2;
                    case "+" -> num1 + num2;
                    default -> num1 - num2;
                };
                operands.set(i, Double.toString(result));
                operators.remove(i);
                operands.remove(i + 1);
                i--;
            }
        }
    }
}
