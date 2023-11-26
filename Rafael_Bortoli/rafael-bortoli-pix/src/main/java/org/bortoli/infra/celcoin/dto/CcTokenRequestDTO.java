package org.bortoli.infra.celcoin.dto;

public class CcTokenRequestDTO {
    private final String client_id = "41b44ab9a56440.teste.celcoinapi.v5";
    private final String grant_type = "client_credentials";
    private final String client_secret = "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3";

    public String getClient_id() {
        return this.client_id;
    }

    public String getGrant_type() {
        return this.grant_type;
    }

    public String getClient_secret() {
        return this.client_secret;
    }
}
