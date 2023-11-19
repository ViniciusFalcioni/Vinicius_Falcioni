package br.com.fag.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PixBO {
  private String key;
  private Double amount;
  private MerchantBO merchant;
}
