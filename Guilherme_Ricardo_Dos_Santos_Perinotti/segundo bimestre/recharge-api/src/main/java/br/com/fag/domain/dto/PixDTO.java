package br.com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PixDTO {
  private String id;
  private String key;
  private Double amount;
  private String qrCode;
  private MerchantDTO merchant;
  private Long transactionId;
}
