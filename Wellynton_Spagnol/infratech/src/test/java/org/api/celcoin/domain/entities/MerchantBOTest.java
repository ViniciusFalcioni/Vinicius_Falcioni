package org.api.celcoin.domain.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MerchantBOTest {
    @Test
    void testConstructor() {
        MerchantBO actualMerchantBO = new MerchantBO("Postal Code", "Oxford", 1, "Name");
        actualMerchantBO.setCategoryCode(1);
        actualMerchantBO.setCity("Oxford");
        actualMerchantBO.setName("Name");
        actualMerchantBO.setPostalCode("Postal Code");
        Integer actualCategoryCode = actualMerchantBO.getCategoryCode();
        String actualCity = actualMerchantBO.getCity();
        String actualName = actualMerchantBO.getName();
        assertEquals("Name", actualName);
        assertEquals("Oxford", actualCity);
        assertEquals("Postal Code", actualMerchantBO.getPostalCode());
        assertEquals(1, actualCategoryCode.intValue());
    }
}
