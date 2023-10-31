package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.RechargeDTO;
import com.fag.infra.celcoin.dto.CelcoinRechargeDTO;
import com.fag.infra.celcoin.dto.CelcoinRechargeValueDTO;

import java.util.UUID;

public class CelcoinRechargeMapper {

    public static RechargeDTO toAppDTO(CelcoinRechargeDTO vendor) {
        return new RechargeDTO(UUID.randomUUID().toString(),
                vendor.topupData().value(),
                vendor.cpfCnpj(),
                vendor.providerId(),
                CelcoinRechargePhoneMapper.toAppDTO(vendor.phone()),
                null,
                null,
                false);
    }

    public static CelcoinRechargeDTO toVendorDTO(RechargeDTO appDTO) {
        return new CelcoinRechargeDTO(appDTO.document(),
                appDTO.operatorId(),
                CelcoinRechargePhoneMapper.toVendorDTO(appDTO.phone()),
                new CelcoinRechargeValueDTO(appDTO.value()));
    }

}
