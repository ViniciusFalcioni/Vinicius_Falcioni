package com.fag.Infra.Celcoin.Mappers;

import com.fag.Domain.DTO.ProductDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinProductDTO;

public class CelcoinProductMapper {
    public static ProductDTO toAppDTO(CelcoinProductDTO vendorDTO) {
        ProductDTO appDTO = new ProductDTO();

        appDTO.setCode(vendorDTO.getCode());
        appDTO.setCost(vendorDTO.getCost());
        appDTO.setName(vendorDTO.getProductName());
        appDTO.setValue(vendorDTO.getMinValue());
        appDTO.setDue(vendorDTO.getDueProduct());

        return appDTO;
    }
}
