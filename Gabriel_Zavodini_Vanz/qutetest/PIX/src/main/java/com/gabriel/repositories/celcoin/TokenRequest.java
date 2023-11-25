package com.gabriel.repositories.celcoin;

import org.jboss.resteasy.reactive.RestForm;

public class TokenRequest {
  @RestForm("client_id")
  private String clientId = "41b44ab9a56440.teste.celcoinapi.v5";

  @RestForm("grant_type")
  private String grantType = "client_credentials";

  @RestForm("client_secret")
  private String clientSecret = "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3";

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
