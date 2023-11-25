package org.example.domain.mappers;

import org.example.domain.dto.MerchantDTO;
import org.example.domain.dto.PixDTO;
import org.example.domain.entities.MerchantBO;
import org.example.domain.entities.PixBO;

import java.util.UUID;

public class PixMapper {

    static PixDTO toDTO (PixBO pixBO) {
        PixDTO pixDTO = new PixDTO();
        MerchantDTO merchantDTO = MerchantMapper.toDTO(pixBO.getMerchantBO());

        pixDTO.setKey(pixBO.getKey());
        pixDTO.setId(pixDTO.getId());
        pixDTO.setAmount(pixBO.getAmount());
        pixDTO.setQrCode(pixBO.getQrCode());
        pixDTO.setTransactionId(pixBO.getTransactionId());
        pixDTO.setMerchant(merchantDTO);

        return pixDTO;
    }

    public static PixBO toBO(PixDTO pixDTO) {
        MerchantBO merchantBO = MerchantMapper.toBO(pixDTO.getMerchant());
        return new PixBO(pixDTO.getId() != null ? UUID.fromString(pixDTO.getId()) : UUID.randomUUID(), pixDTO.getKey(),pixDTO.getAmount(), pixDTO.getQrCode(), pixDTO.getTransactionId(), merchantBO);
    }
}
