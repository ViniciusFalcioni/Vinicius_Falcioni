package com.github.faening.infra.celcoin.mappers;

import com.github.faening.domain.dto.PixQrCodeDTO;
import com.github.faening.infra.celcoin.dto.CelcoinCreateStaticQrCodeRequestDTO;
import com.github.faening.infra.celcoin.dto.CelcoinMerchantDTO;

public class CelcoinPixQrCodeMapper {
    public static CelcoinCreateStaticQrCodeRequestDTO toStaticQrCodeRequestDTO(PixQrCodeDTO pixQrCodeDTO) {
        return new CelcoinCreateStaticQrCodeRequestDTO(
            new CelcoinMerchantDTO(
                pixQrCodeDTO.getPostalCode(),
                pixQrCodeDTO.getCity(),
                pixQrCodeDTO.getMerchantCategoryCode(),
                pixQrCodeDTO.getName()
            ),
            pixQrCodeDTO.getKey(),
            pixQrCodeDTO.getAmount(),
            pixQrCodeDTO.getTransactionIdentification()
        );
    }
}
