package main.java.com.fag.infra.celcoin.mappers;

import main.java.com.fag.domain.dto.ProductDTo;

public class CelcoinProductMapper {
   public static ProductDTO toAppDTO(CelcoinProductDTO vendfoDTO) {
        ProductDTo appDTO = new ProductDTO();

        appDTO.setCode(vendorDTO.getCode());
        appDTO.setCost(vendorDTO.getCost());
        appDTO.setName(vendorDTO.getProductName());
        appDTO.setValue(vendorDTO.getMinValue());
        appDTO.setDueProduct(vendorDTO.getDueProduct());

        return appDTO;
    }
}
