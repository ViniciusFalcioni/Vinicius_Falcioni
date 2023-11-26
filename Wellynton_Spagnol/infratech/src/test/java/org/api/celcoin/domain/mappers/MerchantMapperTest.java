package org.api.celcoin.domain.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.api.celcoin.domain.dto.MerchantDTO;
import org.api.celcoin.domain.entities.MerchantBO;
import org.junit.jupiter.api.Test;

class MerchantMapperTest {
    @Test
    void testToBO() {
        MerchantDTO dto = new MerchantDTO();
        dto.setCategoryCode(1);
        dto.setCity("Oxford");
        dto.setName("Name");
        dto.setPostalCode("Postal Code");
        MerchantBO actualToBOResult = MerchantMapper.toBO(dto);
        assertEquals("Name", actualToBOResult.getName());
        assertEquals("Oxford", actualToBOResult.getCity());
        assertEquals("Postal Code", actualToBOResult.getPostalCode());
        assertEquals(1, actualToBOResult.getCategoryCode().intValue());
    }

    @Test
    void testToDTO() {
        MerchantDTO actualToDTOResult = MerchantMapper.toDTO(MerchantMapper.toBO(new MerchantDTO()));
        assertNull(actualToDTOResult.getCategoryCode());
        assertNull(actualToDTOResult.getCity());
        assertNull(actualToDTOResult.getName());
        assertNull(actualToDTOResult.getPostalCode());
    }

}
