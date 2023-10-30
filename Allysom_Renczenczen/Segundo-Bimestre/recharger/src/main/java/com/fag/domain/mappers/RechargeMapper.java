package com.fag.domain.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.PhoneBO;
import com.fag.domain.entities.RechargeBO;

import java.util.UUID;

public class RechargeMapper {
    public static RechargeBO toBO(RechargeDTO vendorDTO){
        RechargeBO rechargeBO = new RechargeBO();

        rechargeBO.setId(vendorDTO.getId());
        rechargeBO.setValue(vendorDTO.getValue());
        rechargeBO.setDocument(vendorDTO.getDocument());
        rechargeBO.setProviderId(vendorDTO.getOperatorId());

        PhoneBO phoneBO = PhoneMapper.toBO(vendorDTO.getPhone());

        rechargeBO.setPhone(phoneBO);
        rechargeBO.setReceipt(vendorDTO.getReceipt());
        rechargeBO.setTransactionId(vendorDTO.getTransactionId());
        rechargeBO.setSucess(vendorDTO.isSucess());

        return rechargeBO;
    }

    public static RechargeDTO toDTO(RechargeBO vendorBO){
        RechargeDTO rechargeDTO = new RechargeDTO();

        PhoneDTO phoneDTO = PhoneMapper.toDTO(vendorBO.getPhone());
        rechargeDTO.setDocument(vendorBO.getDocument());
        rechargeDTO.setId(vendorBO.getId());
        rechargeDTO.setOperatorId(vendorBO.getProviderId());
        rechargeDTO.setPhone(phoneDTO);
        rechargeDTO.setValue(vendorBO.getValue());
        rechargeDTO.setTransactionId(vendorBO.getTransactionId());
        rechargeDTO.setReceipt(vendorBO.getReceipt());
        rechargeDTO.setSucess(vendorBO.isSucess());
        
        return rechargeDTO;
    }

}

