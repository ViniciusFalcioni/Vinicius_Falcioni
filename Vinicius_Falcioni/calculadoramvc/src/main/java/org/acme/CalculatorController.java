package org.acme;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculate")
public class CalculatorController {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse calculate(CalculatorRequest request) {
        double num1 = request.getNum1();
        double num2 = request.getNum2();
        String operation = request.getOperation();
        CalculatorResponse response = new CalculatorResponse();

        switch (operation) {
            case "add":
                response.setResult(num1 + num2);
                break;
            case "subtract":
                response.setResult(num1 - num2);
                break;
            case "multiply":
                response.setResult(num1 * num2);
                break;
            case "divide":
                if (num2 == 0) {
                    response.setMessage("Division by zero is not allowed.");
                    return response;
                }
                response.setResult(num1 / num2);
                break;
            default:
                response.setMessage("Invalid operation.");
                break;
        }

        return response;
    }
}
