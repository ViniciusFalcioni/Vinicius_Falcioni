package com.fag.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinTokenDTO {

  @JsonbProperty("access_token")
  private String accessToken;

  @JsonbProperty("expires_in")
  private Integer expiresIn;

  @JsonbProperty("token_type")
  private String tokenType;

  public String getAccessToken() {
    return accessToken;
  }

}