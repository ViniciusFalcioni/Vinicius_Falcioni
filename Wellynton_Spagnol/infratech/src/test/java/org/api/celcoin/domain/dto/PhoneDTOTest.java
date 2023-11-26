package org.api.celcoin.domain.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PhoneDTOTest {
    @Test
    void testSetCountryCode() {
        PhoneDTO phoneDTO = new PhoneDTO();
        phoneDTO.setCountryCode(3);
        phoneDTO.setNumber("42");
        phoneDTO.setStateCode(1);
        Integer actualCountryCode = phoneDTO.getCountryCode();
        String actualNumber = phoneDTO.getNumber();
        assertEquals("42", actualNumber);
        assertEquals(1, phoneDTO.getStateCode().intValue());
        assertEquals(3, actualCountryCode.intValue());
    }
}
