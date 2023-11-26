package org.api.celcoin.infra.celcoin.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CelcoinOperatorDTOTest {
    @Test
    void testSetCategory() {
        CelcoinOperatorDTO celcoinOperatorDTO = new CelcoinOperatorDTO();
        celcoinOperatorDTO.setCategory(1);
        celcoinOperatorDTO.setMaxValue(10.0d);
        celcoinOperatorDTO.setMinValue(10.0d);
        celcoinOperatorDTO.setName("Name");
        celcoinOperatorDTO.setProviderId(1);
        celcoinOperatorDTO.setRechargeType(1);
        Integer actualCategory = celcoinOperatorDTO.getCategory();
        Double actualMaxValue = celcoinOperatorDTO.getMaxValue();
        Double actualMinValue = celcoinOperatorDTO.getMinValue();
        String actualName = celcoinOperatorDTO.getName();
        Integer actualProviderId = celcoinOperatorDTO.getProviderId();
        Integer actualRechargeType = celcoinOperatorDTO.getRechargeType();
        assertEquals("Name", actualName);
        assertEquals(1, actualCategory.intValue());
        assertEquals(1, actualProviderId.intValue());
        assertEquals(1, actualRechargeType.intValue());
        assertEquals(10.0d, actualMaxValue.doubleValue());
        assertEquals(10.0d, actualMinValue.doubleValue());
    }
}
