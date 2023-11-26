package org.api.celcoin.infra.celcoin.dto;

import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CelcoinProductsDTOTest {
    @Test
    void testSetProducts() {
        CelcoinProductsDTO celcoinProductsDTO = new CelcoinProductsDTO();
        ArrayList<CelcoinProductDTO> products = new ArrayList<>();
        celcoinProductsDTO.setProducts(products);
        assertSame(products, celcoinProductsDTO.getProducts());
    }
}
