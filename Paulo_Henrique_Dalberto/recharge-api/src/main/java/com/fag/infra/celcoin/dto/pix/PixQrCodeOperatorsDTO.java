package com.fag.infra.celcoin.dto.pix;

import java.util.List;

public class PixQrCodeOperatorsDTO {
  private List<PixQrCodeOperatorDTO> providers;

  public List<PixQrCodeOperatorDTO> getProviders() {
    return providers;
  }

  public void setProviders(List<PixQrCodeOperatorDTO> providers) {
    this.providers = providers;
  }
}
