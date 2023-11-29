package edu.fag.controller;

import edu.fag.model.History;
import edu.fag.service.HistoryService;
import edu.fag.service.CalculatorService;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.inject.Inject;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Objects.requireNonNull;

@Path("/calculator")
public class CalculatorController {
    private final Template calculator;
    @Inject
    CalculatorService calculatorService;
    @Inject
    HistoryService historyService;

    public CalculatorController(Template calculator) {
        this.calculator = requireNonNull(calculator, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        Map<String, Object> model = new HashMap<>();
        model.put("result", "0");
        return calculator.instance().data("calculator", model);
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public Response calculate(String expression) {
        List<String> tokens = tokenizeExpression(expression);
        double result = calculateExpression(tokens);
        saveCalculatorData(expression, result);
        String latestExpression = fetchLatestExpression();
        JsonObject jsonResponse = createJsonResponse(result, latestExpression);
        return Response.ok(jsonResponse).build();
    }

    private List<String> tokenizeExpression(String expression) {
        List<String> tokens = new ArrayList<>();
        Pattern pattern = Pattern.compile("([0-9]+(?:\\.[0-9]+)?|[+\\-*/%])");
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()) { tokens.add(matcher.group()); }
        return tokens;
    }

    private double calculateExpression(List<String> tokens) {
        double operand1 = Double.parseDouble(tokens.get(0));
        double operand2 = Double.parseDouble(tokens.get(2));
        String operator = tokens.get(1);
        if (tokens.size() > 3) {
            String percentOperator = tokens.get(3);
            if (isOperator(percentOperator)) { operand2 = calculatorService.percent(operand1, operand2); }
        }
        return (isNumber(operand1) && isNumber(operand2) && isOperator(operator))
                ? invokeCalculatorServiceMethod(operand1, operand2, operator)
                : 0;
    }

    private static boolean isNumber(double token) {
        return !Double.isInfinite(token) && !Double.isNaN(token);
    }

    private static boolean isOperator(String token) {
        return token.matches("[+\\-*/%]");
    }

    private double invokeCalculatorServiceMethod(double operand1, double operand2, String operator) {
        if (operator.equals("+")) { return calculatorService.add(operand1, operand2); }
        if (operator.equals("-")) { return calculatorService.subtract(operand1, operand2); }
        if (operator.equals("*")) { return calculatorService.multiply(operand1, operand2); }
        if (operator.equals("/")) { return calculatorService.divide(operand1, operand2); }
        return 0;
    }

    private void saveCalculatorData(String expression, double result) {
        History history = new History();
        history.setExpression(expression);
        history.setResult(result);
        history.setTimestamp(new Date());
        historyService.saveHistory(history);
    }

    private String fetchLatestExpression() {
        History latestHistory = historyService.getLatestHistory();
        String latestResult = latestHistory.getExpression() != null ? String.valueOf(latestHistory.getExpression()) : "0";
        return latestResult;
    }

    private JsonObject createJsonResponse(double result, String latestExpression) {
        return Json.createObjectBuilder()
            .add("result", result)
            .add("latestExpression", latestExpression)
            .build();
    }
}
