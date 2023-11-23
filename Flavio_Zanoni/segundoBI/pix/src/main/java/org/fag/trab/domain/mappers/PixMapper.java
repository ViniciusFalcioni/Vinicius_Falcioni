package org.fag.trab.domain.mappers;


import org.fag.trab.domain.dto.MerchantDto;
import org.fag.trab.domain.dto.PixDto;
import org.fag.trab.domain.entities.MerchantBo;
import org.fag.trab.domain.entities.PixBo;

public class PixMapper {
    public static PixDto toDTO(PixBo bo) {
        PixDto dto = new PixDto();
        dto.setId(bo.getId());
        dto.setAmount(bo.getAmount());
        dto.setKey(bo.getKey());
        dto.setDescription(bo.getDescription());

        MerchantBo merchantBo = bo.getMerchant();
        MerchantDto merchantDto = new MerchantDto();

        merchantDto.setName(merchantBo.getName());
        merchantDto.setPostalCode(merchantBo.getPostalCode());
        merchantDto.setCity(merchantBo.getCity());

        dto.setMerchant(merchantDto);

        return dto;
    }

    public static PixBo toBO(PixDto dto) {
        return new PixBo(dto.getKey(), MerchantMapper.toDomain(dto.getMerchant()), dto.getDescription(), dto.getQrCode(), dto.getAmount());
    }
}
