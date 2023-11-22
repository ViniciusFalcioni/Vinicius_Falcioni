package com.fag.model;

public enum OperacaoEnum {
    Soma("Soma"),
    Subtracao("Subtracao"),
    Divisao("Divisao"),
    Multiplicacao("Multiplicacao");

    private String descricao;
    private OperacaoEnum(String descricao){
        this.descricao = descricao;
    };

    public String getDescricao(){
        return this.descricao;
    }
}