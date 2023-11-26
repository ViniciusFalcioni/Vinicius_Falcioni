package org.api.celcoin.infra.celcoin.mappers;

import org.api.celcoin.domain.dto.RechargeDTO;
import org.api.celcoin.infra.celcoin.dto.CelcoinRechargeDTO;
import org.api.celcoin.infra.celcoin.dto.CelcoinRechargeValueDTO;

public class CelcoinRechargeMapper {

    public static CelcoinRechargeDTO toVendorDTO(RechargeDTO appDTO) {
        CelcoinRechargeDTO vendorDTO = new CelcoinRechargeDTO();
        CelcoinRechargeValueDTO topUpData = new CelcoinRechargeValueDTO();

        topUpData.setValue(appDTO.getValue());

        vendorDTO.setCpfCnpj(appDTO.getDocument());
        vendorDTO.setPhone(CelcoinRechargePhoneMapper.toVendorDTO(appDTO.getPhone()));
        vendorDTO.setProviderId(appDTO.getOperatorId());
        vendorDTO.setTopupData(topUpData);

        return vendorDTO;
    }

}
