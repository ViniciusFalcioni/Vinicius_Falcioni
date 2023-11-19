package br.com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PixDTO {
  private String key;
  private Double amount;
  private MerchantDTO merchant;
}
