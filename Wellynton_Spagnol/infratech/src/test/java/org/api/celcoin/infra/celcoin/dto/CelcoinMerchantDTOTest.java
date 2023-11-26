package org.api.celcoin.infra.celcoin.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CelcoinMerchantDTOTest {
    @Test
    void testSetCity() {
        CelcoinMerchantDTO celcoinMerchantDTO = new CelcoinMerchantDTO();
        celcoinMerchantDTO.setCity("Oxford");
        celcoinMerchantDTO.setMerchantCategoryCode(1);
        celcoinMerchantDTO.setName("Name");
        celcoinMerchantDTO.setPostalCode("Postal Code");
        String actualCity = celcoinMerchantDTO.getCity();
        Integer actualMerchantCategoryCode = celcoinMerchantDTO.getMerchantCategoryCode();
        String actualName = celcoinMerchantDTO.getName();
        assertEquals("Name", actualName);
        assertEquals("Oxford", actualCity);
        assertEquals("Postal Code", celcoinMerchantDTO.getPostalCode());
        assertEquals(1, actualMerchantCategoryCode.intValue());
    }
}
