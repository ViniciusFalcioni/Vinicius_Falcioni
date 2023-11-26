package org.walker.tech.pix.infra.celcoin.dto;

public class TokenCelcoinDto {
    private String accessToken;

    public TokenCelcoinDto(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }   
}
