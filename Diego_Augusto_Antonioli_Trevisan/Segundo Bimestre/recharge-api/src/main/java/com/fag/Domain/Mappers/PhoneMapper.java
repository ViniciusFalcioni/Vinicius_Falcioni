package com.fag.Domain.Mappers;

import com.fag.Domain.DTO.PhoneDTO;
import com.fag.Domain.Entities.PhoneBO;

public class PhoneMapper {
    public static PhoneDTO toDTO(PhoneBO phoneBO) {
        if (phoneBO == null) {
            return null;
        }

        PhoneDTO phoneDTO = new PhoneDTO();
        phoneDTO.setStateCode(phoneBO.getStateCode());
        phoneDTO.setCountryCode(phoneBO.getCountryCode());
        phoneDTO.setNumber(phoneBO.getNumber());

        return phoneDTO;
    }

    public static PhoneBO toBO(PhoneDTO phoneDTO) {
        if (phoneDTO == null) {
            return null;
        }

        return new PhoneBO(phoneDTO.getStateCode(),
                phoneDTO.getCountryCode(),
                phoneDTO.getNumber());
    }
}