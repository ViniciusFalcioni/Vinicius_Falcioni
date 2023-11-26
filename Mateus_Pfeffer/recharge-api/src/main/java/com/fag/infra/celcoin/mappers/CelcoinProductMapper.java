package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.ProductDTO;
import com.fag.infra.celcoin.dto.CelcoinProductDTO;

public class CelcoinProductMapper {

    public static ProductDTO toAppDTO(CelcoinProductDTO vendor) {
        return new ProductDTO(vendor.productName(), vendor.minValue(), vendor.dueProduct());
    }

}
