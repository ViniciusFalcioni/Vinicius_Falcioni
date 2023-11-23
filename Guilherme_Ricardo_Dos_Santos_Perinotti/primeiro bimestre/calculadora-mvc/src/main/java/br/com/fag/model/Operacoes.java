package br.com.fag.model;

public enum Operacoes {
  ADICAO(1, "Adição"),
  SUBTRACAO(2, "Subtração"),
  MULTIPLICACAO(3, "Multiplicação"),
  DIVISAO(4, "Divisão");

  private Integer key;
  private String value;

  private Operacoes(Integer key, String value) {
    this.key = key;
    this.value = value;
  }

  public Integer getKey() {
    return this.key;
  }

  public String getValue() {
    return this.value;
  }

  public Operacoes getOption() {
    return this;
  }
}
