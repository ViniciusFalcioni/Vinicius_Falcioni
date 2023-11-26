package org.api.celcoin.infra.celcoin.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CelcoinPixResponseDTOTest {
    @Test
    void testSetQrCode() {
        CelcoinPixResponseDTO celcoinPixResponseDTO = new CelcoinPixResponseDTO();
        celcoinPixResponseDTO.setQrCode("Qr Code");
        celcoinPixResponseDTO.setTransactionId(1L);
        String actualQrCode = celcoinPixResponseDTO.getQrCode();
        assertEquals("Qr Code", actualQrCode);
        assertEquals(1L, celcoinPixResponseDTO.getTransactionId().longValue());
    }
}
