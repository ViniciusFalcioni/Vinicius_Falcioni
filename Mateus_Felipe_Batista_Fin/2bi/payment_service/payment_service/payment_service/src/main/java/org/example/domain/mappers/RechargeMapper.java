package org.example.domain.mappers;

import org.example.domain.dto.PhoneDTO;
import org.example.domain.dto.RechargeDTO;
import org.example.domain.entities.PhoneBO;
import org.example.domain.entities.RechargeBO;

public class RechargeMapper {
    static RechargeDTO toDTO(RechargeBO rechargeBO){
        RechargeDTO rechargeDTO = new RechargeDTO();
        PhoneDTO phone = PhoneMapper.toDTO(rechargeBO.getPhone());

        rechargeDTO.setDocument(rechargeBO.getDocument());
        rechargeDTO.setId(rechargeBO.getId());
        rechargeDTO.setReceipt(rechargeBO.getReceipt());
        rechargeDTO.setSuccess(rechargeBO.isSuccess());
        rechargeDTO.setOperatorId(rechargeBO.getProviderId());
        rechargeDTO.setTransactionId(rechargeBO.getTransactionId());
        rechargeDTO.setValue(rechargeBO.getValue());
        rechargeDTO.setPhone(phone);

        return rechargeDTO;
    }
    static RechargeBO toBO(RechargeDTO rechargeDTO){
        RechargeBO rechargeBO = new RechargeBO();
        PhoneBO phone = PhoneMapper.toBO(rechargeDTO.getPhone());

        rechargeBO.setDocument(rechargeDTO.getDocument());
        rechargeBO.setId(rechargeDTO.getId());
        rechargeBO.setReceipt(rechargeDTO.getReceipt());
        rechargeBO.setSuccess(rechargeDTO.isSuccess());
        rechargeBO.setProviderId(rechargeDTO.getOperatorId());
        rechargeBO.setTransactionId(rechargeDTO.getTransactionId());
        rechargeBO.setValue(rechargeDTO.getValue());
        rechargeBO.setPhone(phone);

        return rechargeBO;
    }
}
