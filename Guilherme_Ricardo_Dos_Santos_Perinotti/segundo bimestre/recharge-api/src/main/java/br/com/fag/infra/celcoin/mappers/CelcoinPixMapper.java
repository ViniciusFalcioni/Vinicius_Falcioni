package br.com.fag.infra.celcoin.mappers;

import br.com.fag.domain.dto.PixDTO;
import br.com.fag.infra.celcoin.dto.request.CelcoinPixDTO;

public class CelcoinPixMapper {

  public static PixDTO toAppDTO(CelcoinPixDTO vendorDTO) {
    PixDTO dto = new PixDTO();
    dto.setKey(vendorDTO.getKey());
    dto.setAmount(vendorDTO.getAmount());
    dto.setMerchant(CelcoinMerchantMapper.toAppDTO(vendorDTO.getMerchant()));

    return dto;
  }

  public static CelcoinPixDTO toVendorDTO(PixDTO appDTO) {
    CelcoinPixDTO dto = new CelcoinPixDTO();

    dto.setKey(appDTO.getKey());
    dto.setAmount(appDTO.getAmount());
    dto.setMerchant(CelcoinMerchantMapper.toVendorDTO(appDTO.getMerchant()));

    return dto;
  }

}
