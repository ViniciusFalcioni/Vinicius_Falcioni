package br.com.fag.infra.celcoin.mappers;

import br.com.fag.domain.dto.RechargeDTO;
import br.com.fag.infra.celcoin.dto.CelcoinRechargeDTO;
import br.com.fag.infra.celcoin.dto.CelcoinRechargeValueDTO;

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
