package infra.celcoin.mappers;

import domain.dto.ProductDTO;
import infra.celcoin.dto.CelcoinProductDTO;

public class CelcoinProductMapper {
    public static ProductDTO toAppDTO(CelcoinProductDTO vendorDTO) {
        ProductDTO appDTO = new ProductDTO();

        appDTO.setDue(vendorDTO.getDueProduct());
        appDTO.setName(vendorDTO.getProductName());
        appDTO.setValue(vendorDTO.getMinValue());

        return appDTO;
    }
}
