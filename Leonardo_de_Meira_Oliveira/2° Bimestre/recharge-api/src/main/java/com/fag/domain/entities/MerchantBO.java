package com.fag.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class MerchantBO {
    String name;
    String postalCode;
    String city;
    Integer category;
}