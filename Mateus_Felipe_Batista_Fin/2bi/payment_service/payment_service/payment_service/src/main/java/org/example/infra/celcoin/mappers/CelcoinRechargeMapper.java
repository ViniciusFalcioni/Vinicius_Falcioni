package org.example.infra.celcoin.mappers;

import org.example.domain.dto.RechargeDTO;
import org.example.domain.entities.RechargeBO;
import org.example.infra.celcoin.dto.CelcoinRechargeDTO;
import org.example.infra.celcoin.dto.CelcoinRechargeValueDTO;

import java.math.BigDecimal;
import java.util.UUID;

public class CelcoinRechargeMapper {
    public static RechargeDTO toAppDTO (CelcoinRechargeDTO vendorDTO) {
        RechargeDTO appDTO = new RechargeDTO();

        appDTO.setPhone(CelcoinRechargePhoneMapper.toAppDTO(vendorDTO.getPhone()));
        appDTO.setValue(vendorDTO.getTopupData().getValue());
        appDTO.setId(UUID.randomUUID().toString());
        // Receipt, Success and TransactionId are null
        appDTO.setDocument(vendorDTO.getCpfCnpj());
        appDTO.setOperatorId(vendorDTO.getProviderId());

        return appDTO;
    }

    public static CelcoinRechargeDTO toVendorDTO (RechargeDTO appDTO) {
        CelcoinRechargeDTO vendorDTO = new CelcoinRechargeDTO();

        vendorDTO.setProviderId(appDTO.getOperatorId());
        vendorDTO.setCpfCnpj(appDTO.getDocument());
        vendorDTO.setPhone(CelcoinRechargePhoneMapper.toVendorDTO(appDTO.getPhone()));

        CelcoinRechargeValueDTO celcoinRechargeValueDTO = new CelcoinRechargeValueDTO();
        celcoinRechargeValueDTO.setValue(appDTO.getValue());

        vendorDTO.setTopupData(celcoinRechargeValueDTO);

        return vendorDTO;
    }
}
