package org.acme;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculate")
public class Calculator {

    public static class OperationRequest {
        private double a;
        private double b;
        private String operationType;

        public OperationRequest() {
        }

        public OperationRequest(double a, double b, String operationType) {
            this.a = a;
            this.b = b;
            this.operationType = operationType;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public String getOperationType() {
            return operationType;
        }

        public void setOperationType(String operationType) {
            this.operationType = operationType;
        }
    }

    public static class OperationResponse {
        private double result;

        public OperationResponse() {
        }

        public OperationResponse(double result) {
            this.result = result;
        }

        public double getResult() {
            return result;
        }

        public void setResult(double result) {
            this.result = result;
        }
    }

    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        return a / b;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public OperationResponse performOperation(OperationRequest request) {
        double result;
        switch (request.getOperationType()) {
            case "add":
                result = add(request.getA(), request.getB());
                break;
            case "subtract":
                result = subtract(request.getA(), request.getB());
                break;
            case "multiply":
                result = multiply(request.getA(), request.getB());
                break;
            case "divide":
                result = divide(request.getA(), request.getB());
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type");
        }
        return new OperationResponse(result);
    }
}
