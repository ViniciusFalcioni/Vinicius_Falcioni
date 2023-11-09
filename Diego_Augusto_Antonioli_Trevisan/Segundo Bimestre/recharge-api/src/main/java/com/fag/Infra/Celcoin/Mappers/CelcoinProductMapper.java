package com.fag.Infra.Celcoin.Mappers;

import com.fag.Domain.DTO.ProductDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinProductDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinProductsDTO;

public class CelcoinProductMapper {
    public static ProductDTO toAppDTO(CelcoinProductsDTO product) {
        ProductDTO appDTO = new ProductDTO();

        appDTO.setDue(product.getDueProduct());
        appDTO.setName(product.getProductName());
        appDTO.setValue(product.getMinValue());

        return appDTO;
    }
}
