package org.api.celcoin.domain.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class PixBOTest {
    @Test
    void testConstructor() {
        UUID id = UUID.randomUUID();
        PixBO actualPixBO = new PixBO(id, "Key", 10.0d, "Qr Code", 1L);

        assertEquals("Key", actualPixBO.getKey());
        assertEquals("Qr Code", actualPixBO.getQrCode());
        assertEquals(10.0d, actualPixBO.getAmount().doubleValue());
        assertEquals(1L, actualPixBO.getTransactionId().longValue());
        assertSame(id, actualPixBO.getId());
    }

    @Test
    void testConstructor2() {
        PixBO actualPixBO = new PixBO(null, "foo", 10.0d, "foo", 1L);

        assertEquals("foo", actualPixBO.getKey());
        assertEquals("foo", actualPixBO.getQrCode());
        assertEquals(10.0d, actualPixBO.getAmount().doubleValue());
        assertEquals(1L, actualPixBO.getTransactionId().longValue());
    }

    @Test
    void testSetAmount() {
        PixBO pixBO = new PixBO(UUID.randomUUID(), "Key", 10.0d, "Qr Code", 1L);
        pixBO.setAmount(10.0d);
        UUID id = UUID.randomUUID();
        pixBO.setId(id);
        pixBO.setKey("Key");
        pixBO.setQrCode("Qr Code");
        pixBO.setTransactionId(1L);
        Double actualAmount = pixBO.getAmount();
        UUID actualId = pixBO.getId();
        String actualKey = pixBO.getKey();
        String actualQrCode = pixBO.getQrCode();
        Long actualTransactionId = pixBO.getTransactionId();
        assertEquals("Key", actualKey);
        assertEquals("Qr Code", actualQrCode);
        assertEquals(10.0d, actualAmount.doubleValue());
        assertEquals(1L, actualTransactionId.longValue());
        assertSame(id, actualId);
    }
}
