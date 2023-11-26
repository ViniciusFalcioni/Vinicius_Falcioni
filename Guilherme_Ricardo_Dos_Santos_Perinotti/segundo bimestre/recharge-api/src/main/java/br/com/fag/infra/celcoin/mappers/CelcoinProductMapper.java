package br.com.fag.infra.celcoin.mappers;

import br.com.fag.domain.dto.ProductDTO;
import br.com.fag.infra.celcoin.dto.response.CelcoinProductDTO;

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
