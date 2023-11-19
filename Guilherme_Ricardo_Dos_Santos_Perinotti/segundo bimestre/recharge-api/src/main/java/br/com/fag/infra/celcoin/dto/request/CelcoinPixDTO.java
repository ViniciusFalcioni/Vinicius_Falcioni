package br.com.fag.infra.celcoin.dto.request;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinPixDTO {
  private String key;
  private Double amount;
  private CelcoinMerchantDTO merchant;

  @JsonbProperty(value = "transactionIdentification")
  private String transactionId;

}
