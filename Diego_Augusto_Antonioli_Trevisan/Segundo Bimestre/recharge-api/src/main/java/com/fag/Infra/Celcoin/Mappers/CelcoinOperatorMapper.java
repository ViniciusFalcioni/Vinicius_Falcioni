package com.fag.Infra.Celcoin.Mappers;

import com.fag.Domain.DTO.OperatorDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinOperatorDTO;

public class CelcoinOperatorMapper {
    public static OperatorDTO toAppDTO(CelcoinOperatorDTO vendorDTO){
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
