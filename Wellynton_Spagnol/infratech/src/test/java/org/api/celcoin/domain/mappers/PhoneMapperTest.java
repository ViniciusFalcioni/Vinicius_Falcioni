package org.api.celcoin.domain.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.api.celcoin.domain.dto.PhoneDTO;
import org.api.celcoin.domain.entities.PhoneBO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PhoneMapperTest {
    @Test
    void testToBO() {
        PhoneDTO dto = new PhoneDTO();
        dto.setCountryCode(3);
        dto.setNumber("42");
        dto.setStateCode(1);
        PhoneBO actualToBOResult = PhoneMapper.toBO(dto);
        assertEquals("42", actualToBOResult.getNumber());
        assertEquals(1, actualToBOResult.getStateCode().intValue());
        assertEquals(3, actualToBOResult.getCountryCode().intValue());
    }

    @Test
    void testToDTO() {
        PhoneDTO actualToDTOResult = PhoneMapper.toDTO(PhoneMapper.toBO(new PhoneDTO()));
        assertNull(actualToDTOResult.getCountryCode());
        assertNull(actualToDTOResult.getStateCode());
        assertNull(actualToDTOResult.getNumber());
    }

}
