package org.api.celcoin.domain.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OperatorDTOTest {
    @Test
    void testSetCategory() {
        OperatorDTO operatorDTO = new OperatorDTO();
        operatorDTO.setCategory(1);
        operatorDTO.setMaxValue(10.0d);
        operatorDTO.setMinValue(10.0d);
        operatorDTO.setName("Name");
        operatorDTO.setProviderId(1);
        operatorDTO.setRechargeType(1);
        Integer actualCategory = operatorDTO.getCategory();
        Double actualMaxValue = operatorDTO.getMaxValue();
        Double actualMinValue = operatorDTO.getMinValue();
        String actualName = operatorDTO.getName();
        Integer actualProviderId = operatorDTO.getProviderId();
        Integer actualRechargeType = operatorDTO.getRechargeType();
        assertEquals("Name", actualName);
        assertEquals(1, actualCategory.intValue());
        assertEquals(1, actualProviderId.intValue());
        assertEquals(1, actualRechargeType.intValue());
        assertEquals(10.0d, actualMaxValue.doubleValue());
        assertEquals(10.0d, actualMinValue.doubleValue());
    }
}
