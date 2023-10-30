package com.fag.domain.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.domain.entities.PhoneBO;

public class PhoneMapper {
    public static PhoneBO toBO(PhoneDTO vendorDTO){
       PhoneBO phoneBO = new PhoneBO();

       phoneBO.setCountryCode(vendorDTO.getCountryCode());
       phoneBO.setNumber(vendorDTO.getNumber());
       phoneBO.setStateCode(vendorDTO.getStateCode());
       return phoneBO;
    }
    public static PhoneDTO toDTO(PhoneBO vendorBO){
        PhoneDTO phoneDTO = new PhoneDTO();
        phoneDTO.setCountryCode(vendorBO.getCountryCode());
        phoneDTO.setNumber(vendorBO.getNumber());
        phoneDTO.setStateCode(vendorBO.getStateCode());
        return phoneDTO;
    }
}
