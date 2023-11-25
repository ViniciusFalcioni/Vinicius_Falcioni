package com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerchantDTO{
    private String name; 
    private String postalCode; 
    private String city;
    private Integer categoryCode; 
}
