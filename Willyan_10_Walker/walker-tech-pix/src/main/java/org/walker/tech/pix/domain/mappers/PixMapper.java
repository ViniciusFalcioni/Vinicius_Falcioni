package org.walker.tech.pix.domain.mappers;

import org.walker.tech.pix.domain.dto.MerchantDto;
import org.walker.tech.pix.domain.dto.PixDto;
import org.walker.tech.pix.domain.entities.MerchantBo;
import org.walker.tech.pix.domain.entities.PixBo;

public class PixMapper {
    public static PixDto toDTO(PixBo bo) {
        if (bo == null) {
            return null;
        }

        PixDto dto = new PixDto();
        dto.setId(bo.getId());
        dto.setAmount(bo.getAmount());
        dto.setKey(bo.getKey());
        dto.setDescription(bo.getDescription());

        MerchantBo merchantBo = bo.getMerchant();
        if (merchantBo != null) {
            MerchantDto merchantDto = MerchantMapper.toDTO(merchantBo);
            dto.setMerchant(merchantDto);
        }

        return dto;
    }

    public static PixBo toBO(PixDto dto) {
        if (dto == null) {
            return null;
        }

        return new PixBo(dto.getKey(), MerchantMapper.toDomain(dto.getMerchant()), dto.getDescription(), dto.getQrCode(), dto.getAmount());
    }

    @Override
    public String toString() {
        return "PixMapper []";
    }
}
