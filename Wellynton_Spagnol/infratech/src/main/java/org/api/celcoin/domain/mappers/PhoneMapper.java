package org.api.celcoin.domain.mappers;

import org.api.celcoin.domain.dto.PhoneDTO;
import org.api.celcoin.domain.entities.PhoneBO;

public class PhoneMapper {

    public static PhoneBO toBO(PhoneDTO dto) {
        return new PhoneBO(dto.getStateCode(), dto.getCountryCode(), dto.getNumber());
    }

    public static PhoneDTO toDTO(PhoneBO bo) {
        PhoneDTO phone = new PhoneDTO();

        phone.setCountryCode(bo.getCountryCode());
        phone.setStateCode(bo.getStateCode());
        phone.setNumber(bo.getNumber());

        return phone;
    }

}
