package com.fag.service;

public class CalculatorService {
  public Float calculate(Float valor1, Float valor2, Integer operation) {
    if (operation == 1) {
      return valor1 + valor2;
  } else if (operation == 2) {
      return valor1 - valor2;
  } else if (operation == 3) {
      return valor1 * valor2;
  } else if (operation == 4) {
      if (valor2 == 0) {
          throw new IllegalArgumentException("Não é possível dividir por zero!");
      }
       return valor1 / valor2;
  }
    return 0f;
  }
}