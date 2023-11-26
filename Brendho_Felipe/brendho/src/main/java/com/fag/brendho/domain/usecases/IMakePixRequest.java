package com.fag.brendho.domain.usecases;

public class IMakePixRequest {
  private String chave;
  private Double value;
  public String getChave() {
    return chave;
  }
  public void setChave(String chave) {
    this.chave = chave;
  }
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }
  public IMakePixRequest(String chave, Double value) {
    this.chave = chave;
    this.value = value;
  }
}
