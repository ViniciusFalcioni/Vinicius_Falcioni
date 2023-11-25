package com.gabriel.repositories.celcoin;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenResponse {
    @JsonProperty(value = "access_token")
  private String accessToken;

  @JsonProperty(value = "expires_in")
  private Integer expiresIn;

  @JsonProperty(value = "token_type")
  private String tokenType;

  public String getAccessToken() {
    return "Bearer " + accessToken;
  }

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public String getTokenType() {
    return tokenType;
  }
}
