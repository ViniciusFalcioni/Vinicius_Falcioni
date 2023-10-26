package com.fag.domain.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.RechargeBO;

import java.util.UUID;

public class RechargeMapper {

    public static RechargeBO toBO(RechargeDTO dto) {
        return new RechargeBO(
                UUID.fromString(dto.id()),
                dto.value(),
                dto.document(),
                dto.operatorId(),
                PhoneMapper.toBO(dto.phone()),
                dto.receipt(),
                dto.transactionId(),
                dto.success());

    }

    public static RechargeDTO toDTO(RechargeBO entity) {
        PhoneDTO phone = PhoneMapper.toDTO(entity.getPhone());

        return new RechargeDTO(entity.getId().toString(), entity.getValue(), entity.getDocument(), entity.getProviderId(), phone, entity.getReceipt(), entity.getTransactionId(), entity.isSuccess());
    }

}
