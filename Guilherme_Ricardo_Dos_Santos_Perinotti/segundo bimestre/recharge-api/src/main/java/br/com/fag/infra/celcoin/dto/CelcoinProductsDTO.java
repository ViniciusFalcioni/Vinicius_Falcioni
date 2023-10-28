package br.com.fag.infra.celcoin.dto;

import java.util.List;

public class CelcoinProductsDTO {
  private List<CelcoinProductDTO> products;

  public CelcoinProductsDTO() {
  }

  public CelcoinProductsDTO(List<CelcoinProductDTO> products) {
    this.products = products;
  }

  public List<CelcoinProductDTO> getProducts() {
    return this.products;
  }

  public void setProducts(List<CelcoinProductDTO> products) {
    this.products = products;
  }
}
