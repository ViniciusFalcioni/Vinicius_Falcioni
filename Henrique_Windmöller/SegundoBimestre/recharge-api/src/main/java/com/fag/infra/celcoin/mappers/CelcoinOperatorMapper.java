package main.java.com.fag.infra.celcoin.mappers;

import main.java.com.fag.domain.dto.OperatorDTO;

public class CelcoinOperatorMapper {
    public static OperatorDTO toAppDTO(CelcoinOperatorDTO vendotDTO)
    {
    OperatorDTO appDTO = new OPeratorDTO();

    appDTO.setCategory(vendoDTO.getCategory());
    appDTO.setMaxValue(vendorDTO.getMaxValue());
    appDTO.setMinValue(vendorDTO.getMinValue());
    appDTO.setName(vendorDTO.getName());
    appDTO.setProviderld(vendorDTO.getProviderId());
    appDTO.setRechargeType(vendorDTO.getRechargeType());
    return appDTO;
    }
}
