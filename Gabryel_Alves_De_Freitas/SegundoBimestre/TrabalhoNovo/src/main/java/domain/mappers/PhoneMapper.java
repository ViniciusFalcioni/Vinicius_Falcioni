package domain.mappers;

import domain.dto.PhoneDTO;
import domain.entities.PhoneBO;

public class PhoneMapper {
    public static PhoneDTO toDTO(PhoneBO phoneBO) {
        if (phoneBO == null)
            return null;
        
        PhoneDTO phoneDTO = new PhoneDTO();
        phoneDTO.setStateCode(phoneBO.getStateCode());
        phoneDTO.setCountryCode(phoneBO.getCountryCode());
        phoneDTO.setNumber(phoneBO.getNumber());
        
        return phoneDTO;
    }

    public static PhoneBO toBO(PhoneDTO phoneDTO) {
        if (phoneDTO == null)
            return null;
        
        PhoneBO phoneBO = new PhoneBO(phoneDTO.getStateCode(), phoneDTO.getCountryCode(), phoneDTO.getNumber());
        return phoneBO;
    }
}
