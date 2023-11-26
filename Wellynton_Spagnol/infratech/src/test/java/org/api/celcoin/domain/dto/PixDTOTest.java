package org.api.celcoin.domain.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class PixDTOTest {
    @Test
    void testSetAmount() {
        PixDTO pixDTO = new PixDTO();
        pixDTO.setAmount(10.0d);
        pixDTO.setId("42");
        pixDTO.setKey("Key");
        MerchantDTO merchant = new MerchantDTO();
        merchant.setCategoryCode(1);
        merchant.setCity("Oxford");
        merchant.setName("Name");
        merchant.setPostalCode("Postal Code");
        pixDTO.setMerchant(merchant);
        pixDTO.setQrCode("Qr Code");
        pixDTO.setTransactionId(1L);
        Double actualAmount = pixDTO.getAmount();
        String actualId = pixDTO.getId();
        String actualKey = pixDTO.getKey();
        MerchantDTO actualMerchant = pixDTO.getMerchant();
        String actualQrCode = pixDTO.getQrCode();
        Long actualTransactionId = pixDTO.getTransactionId();
        assertEquals("42", actualId);
        assertEquals("Key", actualKey);
        assertEquals("Qr Code", actualQrCode);
        assertEquals(10.0d, actualAmount.doubleValue());
        assertEquals(1L, actualTransactionId.longValue());
        assertSame(merchant, actualMerchant);
    }
}
