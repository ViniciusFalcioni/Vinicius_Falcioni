package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.RechargeDTO;
import com.fag.infra.celcoin.dto.CelcoinRechargeDTO;
import com.fag.infra.celcoin.dto.CelcoinRechargeValueDTO;

import java.math.RoundingMode;

public class CelcoinRechargeMapper {

    public static CelcoinRechargeDTO toVendorDTO(RechargeDTO appDTO) {
        CelcoinRechargeDTO celcoinRechargeDTO = new CelcoinRechargeDTO();

        CelcoinRechargeValueDTO topupData = new CelcoinRechargeValueDTO();
        topupData.setValue(appDTO.value());

        celcoinRechargeDTO.setTopupData(topupData);
        celcoinRechargeDTO.setPhone(CelcoinRechargePhoneMapper.toVendorDTO(appDTO.phone()));
        celcoinRechargeDTO.setProviderId(appDTO.operatorId());
        celcoinRechargeDTO.setCpfCnpj(appDTO.document());

        return celcoinRechargeDTO;
    }

}
