package com.fag.Infra.Celcoin.Mappers;

import com.fag.Domain.DTO.RechargeDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinRechargeDTO;
import com.fag.Infra.Celcoin.DTO.CelcoinRechargeValueDTO;

public class CelcoinRechargeMapper {
    public static CelcoinRechargeDTO toVendorDTO(RechargeDTO appDTO) {
        CelcoinRechargeDTO vendorDTO = new CelcoinRechargeDTO();
        CelcoinRechargeValueDTO topUpData = new CelcoinRechargeValueDTO();

        topUpData.setValue(appDTO.getValue());

        vendorDTO.setCpfCnpj(appDTO.getDocument());
        vendorDTO.setPhone(CelcoinRechargePhoneMapper.toVendorDTO(appDTO.getPhone()));
        vendorDTO.setProviderId(appDTO.getOperatorID());
        vendorDTO.setTopupData(topUpData);

        return vendorDTO;
    }
}