package com.fag.domain.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.RechargeBO;

import java.util.UUID;

public class RechargeMapper {

    public static RechargeBO toBO(RechargeDTO dto) {
        return new RechargeBO(
                dto.id() != null ? UUID.fromString(dto.id()) : UUID.randomUUID(),
                dto.value(),
                dto.document(),
                dto.operatorId(),
                PhoneMapper.toBO(dto.phone()),
                dto.receipt(),
                dto.transactionId(),
                dto.success());

    }

    public static RechargeDTO toDTO(RechargeBO entity) {
        PhoneDTO phone = PhoneMapper.toDTO(entity.phone());

        return new RechargeDTO(
                entity.id().toString(),
                entity.value(),
                entity.document(),
                entity.providerId(),
                phone,
                entity.receipt(),
                entity.transactionId(),
                entity.success());
    }

}
