package org.example.infra.celcoin.dto;

public class CelcoinTokenDTO {
    private String accessToken;
    private Integer expiresln;
    private String tokenType;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresln() {
        return expiresln;
    }

    public void setExpiresln(Integer expiresln) {
        this.expiresln = expiresln;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
