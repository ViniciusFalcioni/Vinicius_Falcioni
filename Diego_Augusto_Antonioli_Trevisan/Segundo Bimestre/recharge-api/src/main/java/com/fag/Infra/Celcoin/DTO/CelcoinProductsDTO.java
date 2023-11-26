package com.fag.Infra.Celcoin.DTO;

import java.util.List;

public class CelcoinProductsDTO {
    private List<CelcoinProductDTO> products;

    public List<CelcoinProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<CelcoinProductDTO> products) {
        this.products = products;
    }

}