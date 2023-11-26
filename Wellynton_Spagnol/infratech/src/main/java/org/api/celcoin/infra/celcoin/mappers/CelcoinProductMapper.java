package org.api.celcoin.infra.celcoin.mappers;

import org.api.celcoin.domain.dto.ProductDTO;
import org.api.celcoin.infra.celcoin.dto.CelcoinProductDTO;

public class CelcoinProductMapper {

    public static ProductDTO toAppDTO(CelcoinProductDTO vendorDTO) {
        ProductDTO appDTO = new ProductDTO();

        appDTO.setCode(vendorDTO.getCode());
        appDTO.setCost(vendorDTO.getCost());
        appDTO.setName(vendorDTO.getProductName());
        appDTO.setValue(vendorDTO.getMinValue());
        appDTO.setDueProduct(vendorDTO.getDueProduct());

        return appDTO;
    }

}
