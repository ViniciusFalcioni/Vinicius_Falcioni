package com.fag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneDTO {
    private String number;
    private Integer stateCode;
    private Integer countryCode;
       
}
