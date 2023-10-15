package com.fag.domain.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.domain.entities.PhoneBO;
import com.fag.domain.interfaces.IMapper;

public class PhoneMapper implements IMapper<PhoneDTO, PhoneBO> {

    @Override
    public PhoneBO toBO(PhoneDTO dto) {
        PhoneBO newPhoneBO = new PhoneBO();
        newPhoneBO.setStateCode(dto.stateCode());
        newPhoneBO.setCountryCode(dto.countryCode());
        newPhoneBO.setNumber(dto.number());

        return newPhoneBO;
    }

    @Override
    public PhoneDTO toDTO(PhoneBO entity) {
        return new PhoneDTO(entity.getStateCode(), entity.getCountryCode(), entity.getNumber());
    }

}
