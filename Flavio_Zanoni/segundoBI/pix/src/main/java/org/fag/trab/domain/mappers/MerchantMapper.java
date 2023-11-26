package org.fag.trab.domain.mappers;

import org.fag.trab.domain.dto.MerchantDto;
import org.fag.trab.domain.dto.PixDto;
import org.fag.trab.domain.entities.MerchantBo;
import org.fag.trab.domain.entities.PixBo;

public class MerchantMapper {
    public static MerchantDto toDTO(MerchantBo bo) {
        MerchantDto merchantDto = new MerchantDto();

        merchantDto.setName(bo.getName());
        merchantDto.setPostalCode(bo.getPostalCode());
        merchantDto.setCity(bo.getCity());

        return merchantDto;
    }

    public static MerchantBo toDomain(MerchantDto dto) {
        MerchantBo merchantBo = new MerchantBo();

        merchantBo.setName(dto.getName());
        merchantBo.setPostalCode(dto.getPostalCode());
        merchantBo.setCity(dto.getCity());

        return merchantBo;
    }
}
