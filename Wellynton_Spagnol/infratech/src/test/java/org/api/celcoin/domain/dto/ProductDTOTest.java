package org.api.celcoin.domain.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProductDTOTest {
    @Test
    void testSetCode() {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setCode(1);
        productDTO.setCost(1);
        productDTO.setDueProduct(1);
        productDTO.setName("Name");
        productDTO.setValue(10.0d);
        Integer actualCode = productDTO.getCode();
        Integer actualCost = productDTO.getCost();
        Integer actualDueProduct = productDTO.getDueProduct();
        String actualName = productDTO.getName();
        Double actualValue = productDTO.getValue();
        assertEquals("Name", actualName);
        assertEquals(1, actualCode.intValue());
        assertEquals(1, actualCost.intValue());
        assertEquals(1, actualDueProduct.intValue());
        assertEquals(10.0d, actualValue.doubleValue());
    }
}
