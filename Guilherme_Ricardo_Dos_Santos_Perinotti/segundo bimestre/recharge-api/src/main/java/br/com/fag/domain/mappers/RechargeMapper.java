package br.com.fag.domain.mappers;

import java.util.UUID;

import br.com.fag.domain.dto.RechargeDTO;
import br.com.fag.domain.entities.RechargeBO;

public class RechargeMapper {
  public static RechargeDTO toDTO(RechargeBO param) {
    RechargeDTO dto = new RechargeDTO();

    dto.setId(param.getId() != null ? param.getId().toString() : null);
    dto.setValue(param.getValue());
    dto.setDocument(param.getDocument());
    dto.setOperatorId(param.getProviderId());
    dto.setPhone(PhoneMapper.toDTO(param.getPhone()));
    dto.setReceipt(param.getReceipt());
    dto.setTransactionId(param.getTransactionId());
    dto.setSuccess(param.isSuccess());

    return dto;
  }

  public static RechargeBO toBO(RechargeDTO param) {
    return new RechargeBO(
        param.getId() != null ? UUID.fromString(param.getId()) : null,
        param.getValue(),
        param.getDocument(),
        param.getOperatorId(),
        PhoneMapper.toBO(param.getPhone()),
        param.getReceipt(),
        param.getTransactionId(),
        param.isSuccess());

  }
}
