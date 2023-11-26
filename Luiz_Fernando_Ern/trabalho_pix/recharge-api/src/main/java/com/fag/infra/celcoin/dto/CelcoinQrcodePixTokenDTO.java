package com.fag.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinQrcodePixTokenDTO {
  private String accessToken;
  private String tokenType;
  private Integer expiresIn;

  @JsonbProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  @JsonbProperty("access_token")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @JsonbProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }

  @JsonbProperty("token_type")
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  @JsonbProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  @JsonbProperty("expires_in")
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }
}