package com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class PixDTO {
  private String id;
  private String key;
  private BigDecimal amount;
  private String qrCode;
  private MerchantDTO merchant;
  private Long transactionId;
}