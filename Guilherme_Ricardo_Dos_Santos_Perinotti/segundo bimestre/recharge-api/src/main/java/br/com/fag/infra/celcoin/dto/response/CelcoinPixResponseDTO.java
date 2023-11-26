package br.com.fag.infra.celcoin.dto.response;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinPixResponseDTO {
  private Long transactionId;
  @JsonbProperty(value = "emvqrcps")
  private String qrCode;
}
