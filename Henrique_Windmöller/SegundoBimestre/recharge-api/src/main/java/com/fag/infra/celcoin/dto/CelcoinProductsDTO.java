package main.java.com.fag.infra.celcoin.dto;

import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinProductsDTO {

    @JsonbProperty("value")
    private List<CelcoinProductDTO> products;

    public List<CelcoinProductDTO> getProducts() {
        return products;
    }

    public void setProcucts(List<CelcoinProductDTO> procucts) {
        this.products = products;
    }

}