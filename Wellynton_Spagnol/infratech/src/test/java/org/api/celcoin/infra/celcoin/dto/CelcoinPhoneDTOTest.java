package org.api.celcoin.infra.celcoin.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CelcoinPhoneDTOTest {
    @Test
    void testSetCountryCode() {
        CelcoinPhoneDTO celcoinPhoneDTO = new CelcoinPhoneDTO();
        celcoinPhoneDTO.setCountryCode(3);
        celcoinPhoneDTO.setNumber("42");
        celcoinPhoneDTO.setStateCode(1);
        Integer actualCountryCode = celcoinPhoneDTO.getCountryCode();
        String actualNumber = celcoinPhoneDTO.getNumber();
        assertEquals("42", actualNumber);
        assertEquals(1, celcoinPhoneDTO.getStateCode().intValue());
        assertEquals(3, actualCountryCode.intValue());
    }
}
