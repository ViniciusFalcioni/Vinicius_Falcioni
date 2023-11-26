package org.walker.tech.pix.domain.mappers;

import org.walker.tech.pix.domain.dto.MerchantDto;
import org.walker.tech.pix.domain.entities.MerchantBo;

public class MerchantMapper {
    public static MerchantDto toDTO(MerchantBo bo) {
        if (bo == null) {
            return null;
        }

        MerchantDto merchantDto = new MerchantDto();
        merchantDto.setName(bo.getName());
        merchantDto.setPostalCode(bo.getPostalCode());
        merchantDto.setCity(bo.getCity());

        return merchantDto;
    }

    public static MerchantBo toDomain(MerchantDto dto) {
        if (dto == null) {
            return null;
        }

        MerchantBo merchantBo = new MerchantBo();
        merchantBo.setName(dto.getName());
        merchantBo.setPostalCode(dto.getPostalCode());
        merchantBo.setCity(dto.getCity());

        return merchantBo;
    }
}
