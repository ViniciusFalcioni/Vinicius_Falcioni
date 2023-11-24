package org.acme;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculadora")
@Produces(MediaType.TEXT_HTML)
public class CalculatorController {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getCalculatorPage() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/META-INF/resources/calculadora.html");
        if (inputStream != null) {
            try (Scanner scanner = new Scanner(inputStream, "UTF-8").useDelimiter("\\A")) {
                return scanner.hasNext() ? scanner.next() : "";
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
        return "Erro ao carregar a página da calculadora.";
    }

    @POST
    @Path("/calculate")
    @Produces(MediaType.TEXT_HTML)
    public String calculateResult(CalculatorModel calculatorModel) {
        double firstNumber = calculatorModel.getFirstNumber();
        double secondNumber = calculatorModel.getSecondNumber();
        String operation = calculatorModel.getOperation();
        double result = calculate(firstNumber, secondNumber, operation);
        return "<html>Resultado: " + result + "</html>";
    }

    private double calculate(double firstNumber, double secondNumber, String operation) {
        switch (operation) {
            case "soma":
                return firstNumber + secondNumber;
            case "subtracao":
                return firstNumber - secondNumber;
            case "multiplicacao":
                return firstNumber * secondNumber;
            case "divisao":
                if (secondNumber == 0) {
                    return Double.NaN;
                }
                return firstNumber / secondNumber;
            default:
                throw new IllegalArgumentException("Operação não suportada.");
        }
    }
}
