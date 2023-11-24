package org.apicellcoin.infra.celcoin.dto;

import java.util.List;

public class CelcoinOperatorDTO {

    private List<CelcoinOperatorDTO> providers;

    public List<CelcoinOperatorDTO> getProviders() {
        return this.providers;
    }

    public void setProviders(List<CelcoinOperatorDTO> providers) {
        this.providers = providers;
    }

}