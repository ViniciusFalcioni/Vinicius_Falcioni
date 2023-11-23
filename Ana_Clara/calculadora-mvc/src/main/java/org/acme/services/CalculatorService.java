package org.acme.services;

public class CalculatorService {
  
  public Float calculate(float valueOne, float valueTwo, int operation) {
    if (operation == 1) {
      return valueOne + valueTwo;
    }
    if (operation == 2) {
      return valueOne - valueTwo;
    }
    if (operation == 3) {
      return valueOne * valueTwo;
    }
    if (operation == 4) {
      if (valueTwo == 0) {
        throw new ArithmeticException("Não é possível a divisão por zero.");
      }
      return valueOne / valueTwo;
    }
    return 0f;
  }
}
