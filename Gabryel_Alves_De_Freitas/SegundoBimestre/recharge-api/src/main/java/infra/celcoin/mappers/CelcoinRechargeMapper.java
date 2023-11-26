package infra.celcoin.mappers;

import domain.dto.RechargeDTO;
import infra.celcoin.dto.CelcoinRechargeDTO;
import infra.celcoin.dto.CelcoinRechargeValueDTO;

public class CelcoinRechargeMapper {

    public static CelcoinRechargeDTO toVendorDTO(RechargeDTO appDTO) {
        CelcoinRechargeDTO vendorDTO = new CelcoinRechargeDTO();
        CelcoinRechargeValueDTO toUpData = new CelcoinRechargeValueDTO();

        toUpData.setValue(appDTO.getValue());

        vendorDTO.setCpfCnpj(appDTO.getDocument());
        vendorDTO.setPhone(CelcoinRechargePhoneMapper.toVendorDTO(appDTO.getPhone()));
        vendorDTO.setProviderId(appDTO.getOperatorId());
        vendorDTO.setTopupData(toUpData);

        return vendorDTO;
    }
}
