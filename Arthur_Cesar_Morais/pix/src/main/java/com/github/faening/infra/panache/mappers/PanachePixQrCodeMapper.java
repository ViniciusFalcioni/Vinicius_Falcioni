package com.github.faening.infra.panache.mappers;

import com.github.faening.domain.entities.PixQrCodeBO;
import com.github.faening.infra.panache.model.PanachePixQrCodeModel;

public class PanachePixQrCodeMapper {
    public static PanachePixQrCodeModel toModel(PixQrCodeBO pixQrCodeBO) {
        return new PanachePixQrCodeModel(
            pixQrCodeBO.getId(),
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

    public static PixQrCodeBO toBO(PanachePixQrCodeModel panachePixQrCodeModel) {
        return new PixQrCodeBO(
            panachePixQrCodeModel.getId().toString(),
            panachePixQrCodeModel.getKey(),
            panachePixQrCodeModel.getAmount(),
            panachePixQrCodeModel.getTransactionIdentification(),
            panachePixQrCodeModel.getPostalCode(),
            panachePixQrCodeModel.getCity(),
            panachePixQrCodeModel.getMerchantCategoryCode(),
            panachePixQrCodeModel.getName(),
            panachePixQrCodeModel.getEmvqrcps(),
            panachePixQrCodeModel.getTransactionId()
        );
    }
}
