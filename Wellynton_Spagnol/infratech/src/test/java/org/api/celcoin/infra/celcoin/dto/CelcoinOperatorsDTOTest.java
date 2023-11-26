package org.api.celcoin.infra.celcoin.dto;

import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CelcoinOperatorsDTOTest {
    @Test
    void testSetProviders() {
        CelcoinOperatorsDTO celcoinOperatorsDTO = new CelcoinOperatorsDTO();
        ArrayList<CelcoinOperatorDTO> providers = new ArrayList<>();
        celcoinOperatorsDTO.setProviders(providers);
        assertSame(providers, celcoinOperatorsDTO.getProviders());
    }
}
