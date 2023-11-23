package br.com.fag.service;

import br.com.fag.model.Operacoes;

public class CalculadoraService {
  public Float calcular(Float primeiro, Float segundo, Operacoes operation) {
    switch(operation.getKey()) {
      case 1:
        return primeiro + segundo;

      case 2:
      return primeiro - segundo;

      case 3:
      return primeiro * segundo;

      case 4:
      if(segundo == 0) {
        throw new ArithmeticException("Não é possível dividir por zero");
      }
      return primeiro / segundo;
    }

    return 0f;
  }
}
