package com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MerchantDTO {
    String name;
    String postalCode;
    String city;
    Integer category;
}