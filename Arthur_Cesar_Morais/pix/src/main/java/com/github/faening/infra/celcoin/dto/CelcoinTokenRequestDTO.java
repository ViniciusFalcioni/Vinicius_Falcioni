package com.github.faening.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinTokenRequestDTO {
    @JsonbProperty("client_id")
    private String clientId;

    @JsonbProperty("grant_type")
    private String grantType;

    @JsonbProperty("client_secret")
    private String clientSecret;

    public CelcoinTokenRequestDTO() {
        this.clientId = "41b44ab9a56440.teste.celcoinapi.v5";
        this.grantType = "client_credentials";
        this.clientSecret = "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3";
    }

    public String getClientId() {
        return clientId;
    }

    public String getGrantType() {
        return grantType;
    }

    public String getClientSecret() {
        return clientSecret;
    }
}
