package br.fag.services;

import br.fag.model.Resultado;

public class Divisao {

    public Resultado operacao(int primeiroValor, int segundoValor){
       if(segundoValor <= 0){
            return new Resultado("Divisão por zero ou menor não permitida");
       }
       return new Resultado( primeiroValor / segundoValor);
    }
}
