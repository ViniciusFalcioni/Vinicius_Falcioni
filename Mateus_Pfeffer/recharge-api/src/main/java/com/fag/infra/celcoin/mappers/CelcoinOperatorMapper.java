package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.OperatorDTO;
import com.fag.infra.celcoin.dto.CelcoinOperatorDTO;

public class CelcoinOperatorMapper {

    public static OperatorDTO toAppDTO(CelcoinOperatorDTO vendor) {
        return new OperatorDTO(vendor.category(), vendor.name(), vendor.providerId(), vendor.maxValue(), vendor.minValue());
    }

}
