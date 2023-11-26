package org.api.celcoin.infra.celcoin.mappers;

import org.api.celcoin.domain.dto.OperatorDTO;
import org.api.celcoin.infra.celcoin.dto.CelcoinOperatorDTO;

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
