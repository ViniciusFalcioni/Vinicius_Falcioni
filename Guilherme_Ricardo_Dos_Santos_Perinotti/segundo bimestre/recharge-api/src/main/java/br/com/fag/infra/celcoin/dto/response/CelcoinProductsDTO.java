package br.com.fag.infra.celcoin.dto.response;

import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinProductsDTO {

  @JsonbProperty("value")
  private List<CelcoinProductDTO> products;

}
