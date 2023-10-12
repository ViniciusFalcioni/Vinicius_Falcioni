package com.fag.domain.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.domain.entities.PhoneBO;

public class PhoneMapper {
    private void toDTO(){
        PhoneBO phoneBO = new PhoneBO();
        PhoneDTO phoneDTO = new PhoneDTO();

        Integer countryCode = phoneBO.getCountryCode();
        String number = phoneBO.getNumber();
        Integer stateCode =  phoneBO.getStateCode();

        phoneDTO.setCountryCode(countryCode);
        phoneDTO.setNumber(number);
        phoneDTO.setStateCode(stateCode);
    }
    private void toBO(){

    }
}
