package com.fag.domain.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.PhoneBO;
import com.fag.domain.entities.RechargeBO;
import com.fag.domain.interfaces.IMapper;
import jakarta.inject.Inject;

import java.util.UUID;

public class RechargeMapper implements IMapper<RechargeDTO, RechargeBO> {

    @Inject
    PhoneMapper phoneMapper;

    @Override
    public RechargeBO toBO(RechargeDTO dto) {
        RechargeBO newRechargeBO = new RechargeBO();
        newRechargeBO.setId(UUID.fromString(dto.id()));
        newRechargeBO.setValue(dto.value());
        newRechargeBO.setDocument(dto.document());
        newRechargeBO.setProviderId(dto.operatorId());

        PhoneBO phone = phoneMapper.toBO(dto.phone());

        newRechargeBO.setPhone(phone);
        newRechargeBO.setReceipt(dto.receipt());
        newRechargeBO.setTransactionId(dto.transactionId());
        newRechargeBO.setSuccess(dto.success());

        return newRechargeBO;

    }

    @Override
    public RechargeDTO toDTO(RechargeBO entity) {
        PhoneDTO phone = phoneMapper.toDTO(entity.getPhone());

        return new RechargeDTO(entity.getId().toString(), entity.getValue(), entity.getDocument(), entity.getProviderId(), phone, entity.getReceipt(), entity.getTransactionId(), entity.isSuccess());
    }

}
