package com.fag.infra.celcoin.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CelcoinPixDTO {
    private String key;
    private double amount;
    private CelcoinMerchantDTO merchant;
}