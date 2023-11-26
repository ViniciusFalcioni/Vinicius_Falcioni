package com.github.faening.domain.mappers;

import com.github.faening.domain.dto.PixQrCodeDTO;
import com.github.faening.domain.entities.PixQrCodeBO;

public class PixQrCodeMapper {
    public static PixQrCodeDTO toDTO(PixQrCodeBO pixQrCodeBO) {
        return new PixQrCodeDTO(
            pixQrCodeBO.getId().toString(),
            pixQrCodeBO.getKey(),
            pixQrCodeBO.getAmount(),
            pixQrCodeBO.getTransactionIdentification(),
            pixQrCodeBO.getPostalCode(),
            pixQrCodeBO.getCity(),
            pixQrCodeBO.getMerchantCategoryCode(),
            pixQrCodeBO.getName(),
            pixQrCodeBO.getEmvqrcps(),
            pixQrCodeBO.getTransactionId()
        );
    }

    public static PixQrCodeBO toBO(PixQrCodeDTO pixQrCodeDTO) {
        return new PixQrCodeBO(
            null,
            pixQrCodeDTO.getKey(),
            pixQrCodeDTO.getAmount(),
            pixQrCodeDTO.getTransactionIdentification(),
            pixQrCodeDTO.getPostalCode(),
            pixQrCodeDTO.getCity(),
            pixQrCodeDTO.getMerchantCategoryCode(),
            pixQrCodeDTO.getName(),
            pixQrCodeDTO.getEmvqrcps(),
            pixQrCodeDTO.getTransactionId()
        );
    }
}
