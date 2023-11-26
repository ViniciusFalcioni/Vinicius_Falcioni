package org.bortoli.infra.panache.mapper;

import org.bortoli.domain.entities.PixQrCodeBO;
import org.bortoli.infra.panache.PanachePixQrCode;

public class PanachePixQrCodeMapper {
    public static PanachePixQrCode toEntity(PixQrCodeBO pixQrCodeBO) {
        PanachePixQrCode panachePixQrCode = new PanachePixQrCode();
        panachePixQrCode.setId(pixQrCodeBO.getId());
        panachePixQrCode.setKey(pixQrCodeBO.getKey());
        panachePixQrCode.setPostalCode(pixQrCodeBO.getPostalCode());
        panachePixQrCode.setQrcode(pixQrCodeBO.getQrcode());
        panachePixQrCode.setMerchantName(pixQrCodeBO.getMerchantName());
        panachePixQrCode.setCity(pixQrCodeBO.getCity());
        panachePixQrCode.setAmount(pixQrCodeBO.getAmount());
        panachePixQrCode.setDescription(pixQrCodeBO.getDescription());
        return panachePixQrCode;
    }

    public static PixQrCodeBO toDomain(PanachePixQrCode panachePix) {
        PixQrCodeBO pixQrCodeBO = new PixQrCodeBO();
        pixQrCodeBO.setId(panachePix.getId());
        pixQrCodeBO.setKey(panachePix.getKey());
        pixQrCodeBO.setPostalCode(panachePix.getPostalCode());
        pixQrCodeBO.setQrcode(panachePix.getQrcode());
        pixQrCodeBO.setMerchantName(panachePix.getMerchantName());
        pixQrCodeBO.setCity(panachePix.getCity());
        pixQrCodeBO.setAmount(panachePix.getAmount());
        pixQrCodeBO.setDescription(panachePix.getDescription());
        return pixQrCodeBO;
    }
}
