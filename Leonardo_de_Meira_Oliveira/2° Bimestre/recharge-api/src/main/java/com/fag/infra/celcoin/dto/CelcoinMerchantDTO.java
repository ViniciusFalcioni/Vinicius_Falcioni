package com.fag.infra.celcoin.dto;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class CelcoinMerchantDTO {
    String name;
    String postalCode;
    String city;
    Integer merchantCategoryCode;
}