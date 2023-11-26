package org.api.celcoin.domain.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.api.celcoin.domain.dto.MerchantDTO;
import org.api.celcoin.domain.dto.PixDTO;
import org.api.celcoin.domain.entities.PixBO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PixMapperTest {

    @Test
    void testToBO2() {
        MerchantDTO merchant = new MerchantDTO();
        merchant.setCategoryCode(1);
        merchant.setCity("Oxford");
        merchant.setName("Name");
        merchant.setPostalCode("Postal Code");

        PixDTO dto = new PixDTO();
        dto.setAmount(10.0d);
        dto.setKey("Key");
        dto.setMerchant(merchant);
        dto.setQrCode("Qr Code");
        dto.setTransactionId(1L);
        dto.setId(null);
        PixBO actualToBOResult = PixMapper.toBO(dto);
        assertEquals("Key", actualToBOResult.getKey());
        assertEquals("Qr Code", actualToBOResult.getQrCode());
        assertEquals(10.0d, actualToBOResult.getAmount().doubleValue());
        assertEquals(1L, actualToBOResult.getTransactionId().longValue());
    }

    @Test
    void testToDTO() {
        PixDTO actualToDTOResult = PixMapper.toDTO(PixMapper.toBO(new PixDTO()));
        assertNull(actualToDTOResult.getAmount());
        assertNull(actualToDTOResult.getTransactionId());
        assertNull(actualToDTOResult.getKey());
        assertNull(actualToDTOResult.getQrCode());
    }

    @Test
    void testToDTO2() {
        PixBO bo = PixMapper.toBO(new PixDTO());
        bo.setId(null);
        PixDTO actualToDTOResult = PixMapper.toDTO(bo);
        assertNull(actualToDTOResult.getAmount());
        assertNull(actualToDTOResult.getTransactionId());
        assertNull(actualToDTOResult.getId());
        assertNull(actualToDTOResult.getKey());
        assertNull(actualToDTOResult.getQrCode());
    }

}
