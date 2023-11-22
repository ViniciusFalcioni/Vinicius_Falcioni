package br.com.fag.domain.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class TokenDTO {
  @JsonbProperty("access_token")
  private String accessToken;
}
