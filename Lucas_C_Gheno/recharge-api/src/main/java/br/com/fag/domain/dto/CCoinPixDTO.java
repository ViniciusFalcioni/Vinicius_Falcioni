package br.com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CCoinPixDTO {
    private String id;
    private String key;
    private Double amount;
    private String qrCode;
    private CCoinMerchantDTO merchant;
    private Long transactionId;

}