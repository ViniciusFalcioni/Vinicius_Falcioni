package br.com.fag.infra.celcoin.dto.response;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinOperatorDTO {

  private Integer category;

  @JsonbProperty("TipoRecarganameProvider")
  private Integer rechargeType;

  private String name;

  private Integer providerId;

  private Double maxValue;

  private Double minValue;
  
}
