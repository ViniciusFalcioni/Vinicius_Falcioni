package org.acme.model;

public enum EnumUserOption {
  ADICAO(1,"Adição"),
  SUBTRACAO(2,"Subtração"),
  MULTIPLICACAO(3,"Multiplicação"),
  DIVISAO(4,"Divisão");

  private String operacao;
  private int key;

  private EnumUserOption(int key, String operacao){
    this.operacao = operacao;
    this.key = key;
  }

  public int getKey() {
    return this.key;
  }

  public String getValue(){
    return this.operacao;
  }

  public EnumUserOption getOperations() {
    return this;
  }
}
