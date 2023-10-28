package br.com.fag.infra.celcoin.dto;

public class CelcoinRechargeValueDTO {
  private Double value;

  public CelcoinRechargeValueDTO() {
  }

  public CelcoinRechargeValueDTO(Double value) {
    this.value = value;
  }

  public Double getValue() {
    return this.value;
  }

  public void setValue(Double value) {
    this.value = value;
  }
}
