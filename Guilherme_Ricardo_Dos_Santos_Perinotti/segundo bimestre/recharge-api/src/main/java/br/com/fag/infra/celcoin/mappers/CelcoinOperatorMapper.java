package br.com.fag.infra.celcoin.mappers;

import br.com.fag.domain.dto.OperatorDTO;
import br.com.fag.infra.celcoin.dto.response.CelcoinOperatorDTO;

public class CelcoinOperatorMapper {

  public static OperatorDTO toAppDTO(CelcoinOperatorDTO vendorDTO) {
    OperatorDTO appDTO = new OperatorDTO();

    appDTO.setCategory(vendorDTO.getCategory());
    appDTO.setMaxValue(vendorDTO.getMaxValue());
    appDTO.setMinValue(vendorDTO.getMinValue());
    appDTO.setName(vendorDTO.getName());
    appDTO.setProviderId(vendorDTO.getProviderId());
    appDTO.setRechargeType(vendorDTO.getRechargeType());

    return appDTO;
  }

}
