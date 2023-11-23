package org.fag.services;

public class CalcService {
  public Float calculate(Float firstItem, Float secondItem, String operation) {
    switch(operation) {
      case "*":
        return firstItem * secondItem;

      case "+":
      return firstItem + secondItem;

      case "-":
      return firstItem - secondItem;

      case "/":
      if(secondItem == 0) {
        throw new ArithmeticException("Não pode dividir por zero");
      }
      return firstItem / secondItem;
    }

    return 0f;
  }
}