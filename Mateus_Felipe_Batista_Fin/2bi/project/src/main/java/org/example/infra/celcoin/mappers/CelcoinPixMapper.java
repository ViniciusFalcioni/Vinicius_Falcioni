package org.example.infra.celcoin.mappers;

import org.example.domain.dto.MerchantDTO;
import org.example.domain.dto.PixDTO;
import org.example.domain.mappers.MerchantMapper;
import org.example.infra.celcoin.dto.CelcoinMerchantDTO;
import org.example.infra.celcoin.dto.CelcoinPixDTO;

import java.math.RoundingMode;

public class CelcoinPixMapper {
    public static PixDTO toAppDTO(CelcoinPixDTO vendor) {
        PixDTO pixDTO = new PixDTO();
        MerchantDTO merchantDTO = CelcoinMerchantMapper.toAppDTO(vendor.getMerchant());

        pixDTO.setKey(vendor.getKey());
        pixDTO.setAmount(vendor.getAmount());
        pixDTO.setMerchant(merchantDTO);
        pixDTO.setTransactionId(Long.valueOf(vendor.getTransactionId()));

        return pixDTO;
    }

    public static CelcoinPixDTO toVendorDTO(PixDTO appDTO) {
        CelcoinPixDTO dto = new CelcoinPixDTO();

        dto.setKey(appDTO.getKey());

        // É necessário informar 2 casas decimais, caso contrário é retornada
        // uma exception a partir da API da Celcoin

        dto.setAmount(appDTO.getAmount().setScale(2, RoundingMode.HALF_UP));
        dto.setMerchant(CelcoinMerchantMapper.toVendorDTO(appDTO.getMerchant()));

        return dto;
    }
}
