package org.api.celcoin.infra.celcoin.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class CelcoinPixDTOTest {
    @Test
    void testSetAmount() {
        CelcoinPixDTO celcoinPixDTO = new CelcoinPixDTO();
        celcoinPixDTO.setAmount(10.0d);
        celcoinPixDTO.setKey("Key");
        CelcoinMerchantDTO merchant = new CelcoinMerchantDTO();
        merchant.setCity("Oxford");
        merchant.setMerchantCategoryCode(1);
        merchant.setName("Name");
        merchant.setPostalCode("Postal Code");
        celcoinPixDTO.setMerchant(merchant);
        celcoinPixDTO.setTransactionId("42");
        Double actualAmount = celcoinPixDTO.getAmount();
        String actualKey = celcoinPixDTO.getKey();
        CelcoinMerchantDTO actualMerchant = celcoinPixDTO.getMerchant();
        assertEquals("42", celcoinPixDTO.getTransactionId());
        assertEquals("Key", actualKey);
        assertEquals(10.0d, actualAmount.doubleValue());
        assertSame(merchant, actualMerchant);
    }
}
