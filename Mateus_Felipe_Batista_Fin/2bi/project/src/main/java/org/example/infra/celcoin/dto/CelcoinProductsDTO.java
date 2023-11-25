package org.example.infra.celcoin.dto;

import java.util.List;

public class CelcoinProductsDTO {
    private List<CelcoinProductDTO> procucts;

    public List<CelcoinProductDTO> getProcucts() {
        return procucts;
    }

    public void setProcucts(List<CelcoinProductDTO> procucts) {
        this.procucts = procucts;
    }
}
