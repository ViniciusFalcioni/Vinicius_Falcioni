package org.example.domain.mappers;



import org.example.domain.dto.PhoneDTO;
import org.example.domain.dto.RechargeDTO;
import org.example.domain.entities.PhoneBO;
import org.example.domain.entities.RechargeBO;

import java.util.UUID;

public class RechargeMapper {
    static RechargeDTO toDTO(RechargeBO rechargeBO){
        RechargeDTO rechargeDTO = new RechargeDTO();
        PhoneDTO phone = PhoneMapper.toDTO(rechargeBO.getPhone());

        rechargeDTO.setDocument(rechargeBO.getDocument());
        rechargeDTO.setId(rechargeBO.getId().toString());
        rechargeDTO.setReceipt(rechargeBO.getReceipt());
        rechargeDTO.setSuccess(rechargeBO.isSuccess());
        rechargeDTO.setOperatorId(rechargeBO.getProviderId());
        rechargeDTO.setTransactionId(rechargeBO.getTransactionId());
        rechargeDTO.setValue(rechargeBO.getValue());
        rechargeDTO.setPhone(phone);

        return rechargeDTO;
    }
    static RechargeBO toBO(RechargeDTO rechargeDTO){
        PhoneBO phone = PhoneMapper.toBO(rechargeDTO.getPhone());
        return new RechargeBO (UUID.fromString(rechargeDTO.getId()) , rechargeDTO.getValue(), rechargeDTO.getDocument(), rechargeDTO.getOperatorId(), phone, rechargeDTO.getReceipt(), rechargeDTO.getTransactionId(), rechargeDTO.isSuccess());
    }
}
