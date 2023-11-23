package com.fag.domain.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.RechargeBO;

import java.util.UUID;

public class RechargeMapper {

    public static RechargeBO toBO(RechargeDTO dto) {
        return new RechargeBO(
                dto.getId() != null ? UUID.fromString(dto.getId()) : UUID.randomUUID(),
                dto.getValue(),
                dto.getDocument(),
                dto.getOperatorId(),
                PhoneMapper.toBO(dto.getPhone()),
                dto.getReceipt(),
                dto.getTransactionId(),
                dto.isSuccess());

    }

    public static RechargeDTO toDTO(RechargeBO bo) {
        RechargeDTO dto = new RechargeDTO();

        dto.setId(bo.id() != null ? bo.id().toString() : null);
        dto.setValue(bo.value());
        dto.setDocument(bo.document());
        dto.setOperatorId(bo.providerId());
        dto.setPhone(PhoneMapper.toDTO(bo.phone()));
        dto.setReceipt(bo.receipt());
        dto.setTransactionId(bo.transactionId());
        dto.setSuccess(bo.success());

        return dto;
    }

}
