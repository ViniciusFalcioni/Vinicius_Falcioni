package org.acme;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculate")
public class CalculatorResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public CalculationResponse calculate(CalculationRequest request) {
        double result = 0;
        switch (request.getOperation()) {
            case "add":
                result = request.getNum1() + request.getNum2();
                break;
            case "subtract":
                result = request.getNum1() - request.getNum2();
                break;
            case "multiply":
                result = request.getNum1() * request.getNum2();
                break;
            case "divide":
                if(request.getNum2() != 0) {
                    result = request.getNum1() / request.getNum2();
                }
                break;
        }
        return new CalculationResponse(result);
    }
}
