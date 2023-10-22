package domain.mappers;

import java.util.UUID;

import domain.dto.RechargeDTO;
import domain.entities.PhoneBO;
import domain.entities.RechargeBO;

public class RechargeMapper {
    public static RechargeDTO toDTO(RechargeBO rechargeBO) {
        if (rechargeBO == null) {
            return null;
        }
        
        RechargeDTO rechargeDTO = new RechargeDTO();
        rechargeDTO.setId(rechargeBO.getId().toString()); // Assuming id is a UUID
        rechargeDTO.setValue(rechargeBO.getValue());
        rechargeDTO.setDocument(rechargeBO.getDocument());
        rechargeDTO.setOperatorId(rechargeBO.getProviderId());
        rechargeDTO.setPhone(PhoneMapper.toDTO(rechargeBO.getPhone()));
        rechargeDTO.setReceipt(rechargeBO.getReceipt());
        rechargeDTO.setTransactionId(rechargeBO.getTransactionId());
        rechargeDTO.setSuccess(rechargeBO.getSuccess());
        
        return rechargeDTO;
    }

    public static RechargeBO toBO(RechargeDTO rechargeDTO) {
        if (rechargeDTO == null) {
            return null;
        }
        
        PhoneBO phoneBO = PhoneMapper.toBO(rechargeDTO.getPhone());
        RechargeBO rechargeBO = new RechargeBO(
            UUID.fromString(rechargeDTO.getId()),
            rechargeDTO.getValue(),
            rechargeDTO.getDocument(),
            rechargeDTO.getOperatorId(),
            phoneBO,
            rechargeDTO.getReceipt(),
            rechargeDTO.getTransactionId(),
            rechargeDTO.getSuccess()
        );
        
        return rechargeBO;
    }
}