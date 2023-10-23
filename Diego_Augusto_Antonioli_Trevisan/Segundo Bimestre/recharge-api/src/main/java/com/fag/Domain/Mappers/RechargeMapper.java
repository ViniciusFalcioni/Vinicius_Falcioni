package com.fag.Domain.Mappers;

import java.util.UUID;

import com.fag.Domain.DTO.RechargeDTO;
import com.fag.Domain.Entities.RechargeBO;

public class RechargeMapper {
    public static RechargeDTO toDTO(RechargeBO rechargeBO) {
        if (rechargeBO == null) {
            return null;
        }

        RechargeDTO rechargeDTO = new RechargeDTO();
        rechargeDTO.setId(rechargeBO.getId().toString());
        rechargeDTO.setValue(rechargeBO.getValue());
        rechargeDTO.setDocument(rechargeBO.getDocument());
        rechargeDTO.setPhone(PhoneMapper.toDTO(rechargeBO.getPhone()));
        rechargeDTO.setReceipt(rechargeBO.getReceipt());
        rechargeDTO.setTransactionId(rechargeBO.getTransactionId());
        rechargeDTO.setSuccess(rechargeBO.isSuccess());

        return rechargeDTO;
    }

    public static RechargeBO toBO(RechargeDTO rechargeDTO) {
        if (rechargeDTO == null) {
            return null;
        }

        return new RechargeBO(
                UUID.fromString(rechargeDTO.getId()),
                rechargeDTO.getValue(),
                rechargeDTO.getDocument(),
                PhoneMapper.toBO(rechargeDTO.getPhone()),
                rechargeDTO.getReceipt(),
                rechargeDTO.getTransactionId(),
                rechargeDTO.isSuccess());
    }
}
