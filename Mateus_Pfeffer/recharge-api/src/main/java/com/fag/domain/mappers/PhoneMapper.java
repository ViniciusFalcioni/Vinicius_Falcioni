package com.fag.domain.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.domain.entities.PhoneBO;

public class PhoneMapper {

    public static PhoneBO toBO(PhoneDTO dto) {
        return new PhoneBO(
                dto.stateCode(),
                dto.countryCode(),
                dto.number());
    }

    public static PhoneDTO toDTO(PhoneBO entity) {
        return new PhoneDTO(entity.stateCode(), entity.countryCode(), entity.number());
    }

}
