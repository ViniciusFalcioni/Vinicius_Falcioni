package model;

public class CalculatorService {

    public String realizarCalculo(String operation, double num1, double num2) {
        String messageResult;
        switch (operation) {
            case "add":
                messageResult = "O resultado da adição é: " + (num1 + num2);
                return messageResult;
            case "subtract":
                messageResult = "O resultado da subtração é: " + (num1 - num2);
                return messageResult;
            case "multiply":
                messageResult = "O resultado da multiplicação é: " + (num1 * num2);
                return messageResult;
            case "divide":
                if (num2 != 0) {
                    messageResult = "O resultado da divisão é: " + (num1 / num2);
                    return messageResult;
                } else {
                    messageResult = "Não é possível dividir por 0";
                    return messageResult;
                }
            default:
                messageResult="Escolha uma opção";
                return messageResult;
        }
    }
}
