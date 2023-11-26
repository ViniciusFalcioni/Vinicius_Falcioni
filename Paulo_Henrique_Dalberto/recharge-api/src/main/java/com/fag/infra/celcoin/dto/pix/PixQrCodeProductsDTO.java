package com.fag.infra.celcoin.dto.pix;

import java.util.List;

public class PixQrCodeProductsDTO {
  private List<PixQrCodeProductDTO> products;

  public List<PixQrCodeProductDTO> getProducts() {
    return products;
  }

  public void setProducts(List<PixQrCodeProductDTO> products) {
    this.products = products;
  }
}
