package org.example.domain.mappers;


import org.example.domain.dto.PhoneDTO;
import org.example.domain.entities.PhoneBO;

public class PhoneMapper {
    static PhoneDTO toDTO(PhoneBO phoneBO){

        PhoneDTO phoneDTO = new PhoneDTO();

        phoneDTO.setCountryCode(phoneBO.getCountryCode());
        phoneDTO.setNumber(phoneBO.getNumber());
        phoneDTO.setStateCode(phoneBO.getStateCode());

        return phoneDTO;
    }
    static PhoneBO toBO(PhoneDTO phoneDTO){
        return new PhoneBO(phoneDTO.getCountryCode(),phoneDTO.getStateCode(),phoneDTO.getNumber());
    }
}
