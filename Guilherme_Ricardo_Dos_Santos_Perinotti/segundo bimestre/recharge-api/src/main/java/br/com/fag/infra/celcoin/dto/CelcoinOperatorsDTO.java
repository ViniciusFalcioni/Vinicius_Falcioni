package br.com.fag.infra.celcoin.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinOperatorsDTO {

  private List<CelcoinOperatorDTO> providers;

}
