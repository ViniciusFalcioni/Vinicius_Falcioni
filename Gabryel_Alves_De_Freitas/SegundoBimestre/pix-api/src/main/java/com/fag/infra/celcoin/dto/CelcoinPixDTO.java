package com.fag.infra.celcoin.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinPixDTO {
  private String key;
  private BigDecimal amount;
  private CelcoinMerchantDTO merchant;
}
