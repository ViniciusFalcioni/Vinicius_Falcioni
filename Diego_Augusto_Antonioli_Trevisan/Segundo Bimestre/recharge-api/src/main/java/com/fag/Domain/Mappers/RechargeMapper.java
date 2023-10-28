package com.fag.Domain.Mappers;

import java.util.UUID;

import com.fag.Domain.DTO.RechargeDTO;
import com.fag.Domain.Entities.RechargeBO;

public class RechargeMapper {

    public static RechargeBO toBO(RechargeDTO dto) {
        return new RechargeBO(
                dto.getId() != null ? UUID.fromString(dto.getId()) : null,
                dto.getValue(),
                dto.getDocument(),
                dto.getOperatorID(),
                PhoneMapper.toBO(dto.getPhone()),
                dto.getReceipt(),
                dto.getTransactionId(),
                dto.getSuccess());
    }

    public static RechargeDTO toDTO(RechargeBO bo) {
        RechargeDTO dto = new RechargeDTO();

        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setValue(bo.getValue());
        dto.setDocument(bo.getDocument());
        dto.setOperatorID(bo.getOperatorId());
        dto.setPhone(PhoneMapper.toDTO(bo.getPhone()));
        dto.setReceipt(bo.getReceipt());
        dto.setTransactionId(bo.getTransactionId());
        dto.setSuccess(bo.getSuccess());

        return dto;
    }

}