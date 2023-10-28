package br.com.fag.infra.celcoin.dto;

import java.util.List;

public class CelcoinOperatorsDTO {
  private List<CelcoinOperatorDTO> providers;

  public CelcoinOperatorsDTO() {
  }

  public CelcoinOperatorsDTO(List<CelcoinOperatorDTO> providers) {
    this.providers = providers;
  }

  public List<CelcoinOperatorDTO> getProviders() {
    return this.providers;
  }

  public void setProviders(List<CelcoinOperatorDTO> providers) {
    this.providers = providers;
  }
}
