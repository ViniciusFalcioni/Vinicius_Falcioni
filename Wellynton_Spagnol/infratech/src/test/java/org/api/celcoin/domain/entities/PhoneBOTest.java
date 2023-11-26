package org.api.celcoin.domain.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PhoneBOTest {
    @Test
    void testConstructor() {
        PhoneBO actualPhoneBO = new PhoneBO(1, 3, "42");
        actualPhoneBO.setCountryCode(3);
        actualPhoneBO.setNumber("42");
        actualPhoneBO.setStateCode(1);
        Integer actualCountryCode = actualPhoneBO.getCountryCode();
        String actualNumber = actualPhoneBO.getNumber();
        assertEquals("42", actualNumber);
        assertEquals(1, actualPhoneBO.getStateCode().intValue());
        assertEquals(3, actualCountryCode.intValue());
    }
}
