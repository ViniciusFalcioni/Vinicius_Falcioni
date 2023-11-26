package org.api.celcoin.domain.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MerchantDTOTest {
    @Test
    void testSetCategoryCode() {
        MerchantDTO merchantDTO = new MerchantDTO();
        merchantDTO.setCategoryCode(1);
        merchantDTO.setCity("Oxford");
        merchantDTO.setName("Name");
        merchantDTO.setPostalCode("Postal Code");
        Integer actualCategoryCode = merchantDTO.getCategoryCode();
        String actualCity = merchantDTO.getCity();
        String actualName = merchantDTO.getName();
        assertEquals("Name", actualName);
        assertEquals("Oxford", actualCity);
        assertEquals("Postal Code", merchantDTO.getPostalCode());
        assertEquals(1, actualCategoryCode.intValue());
    }
}
