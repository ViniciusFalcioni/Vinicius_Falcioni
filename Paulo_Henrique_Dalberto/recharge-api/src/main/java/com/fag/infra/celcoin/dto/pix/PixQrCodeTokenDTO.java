package com.fag.infra.celcoin.dto.pix;

import jakarta.json.bind.annotation.JsonbProperty;

public class PixQrCodeTokenDTO {
  private String accessToken;
  private Integer expiresIn;
  private String tokenType;

  @JsonbProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  @JsonbProperty("access_token")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @JsonbProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  @JsonbProperty("expires_in")
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  @JsonbProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }

  @JsonbProperty("token_type")
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }
}
