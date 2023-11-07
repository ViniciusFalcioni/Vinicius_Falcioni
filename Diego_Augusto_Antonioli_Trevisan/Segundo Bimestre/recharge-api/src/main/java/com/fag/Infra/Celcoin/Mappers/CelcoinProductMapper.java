package com.fag.Infra.Celcoin.Mappers;

import com.fag.Domain.DTO.ProductDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinProductDTO;

public class CelcoinProductMapper {
    public static ProductDTO toAppDTO(CelcoinProductDTO vendorDTO) {
        ProductDTO appDTO = new ProductDTO();

        appDTO.setDue(vendorDTO.getDueProduct());
        appDTO.setName(vendorDTO.getProductName());
        appDTO.setValue(vendorDTO.getMinValue());

        return appDTO;
    }
}
