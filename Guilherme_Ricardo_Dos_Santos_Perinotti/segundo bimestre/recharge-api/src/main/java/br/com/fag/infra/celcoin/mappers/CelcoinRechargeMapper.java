package br.com.fag.infra.celcoin.mappers;

import br.com.fag.domain.dto.RechargeDTO;
import br.com.fag.infra.celcoin.dto.CelcoinRechargeDTO;
import br.com.fag.infra.celcoin.dto.CelcoinRechargeValueDTO;

public class CelcoinRechargeMapper {
  public static CelcoinRechargeDTO toVendorDTO(RechargeDTO vendorDTO) {
    return new CelcoinRechargeDTO(vendorDTO.getDocument(), vendorDTO.getOperatorId(),
        CelcoinRechargePhoneMapper.toVendorDTO(vendorDTO.getPhone()),
        new CelcoinRechargeValueDTO(vendorDTO.getValue()));
  }
}
