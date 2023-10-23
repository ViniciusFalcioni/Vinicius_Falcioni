package com.fag.domain.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.domain.entities.PhoneBO;

public class PhoneMapper {
    public static PhoneDTO toDTO(PhoneBO phoneBO) {
        PhoneDTO phoneDTO = new PhoneDTO();
        phoneDTO.setCountryCode(phoneBO.getCountryCode());
        phoneDTO.setNumber(phoneBO.getNumber());
        phoneDTO.setStateCode(phoneBO.getStateCode());
        return phoneDTO;
    }

    public static PhoneBO toBO(PhoneDTO phoneDTO) {
        return new PhoneBO(phoneDTO.getStateCode(), phoneDTO.getCountryCode(), phoneDTO.getNumber());
    }
}
