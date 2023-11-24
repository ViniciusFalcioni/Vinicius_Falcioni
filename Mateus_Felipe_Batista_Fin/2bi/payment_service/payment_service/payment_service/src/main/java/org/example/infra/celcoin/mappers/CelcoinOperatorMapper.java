package main.java.org.example.infra.celcoin.mappers;


import main.java.org.example.domain.dto.OperatorDTO;
import main.java.org.example.infra.celcoin.dto.CelcoinOperatorDTO;

public class CelcoinOperatorMapper {
    public static OperatorDTO toAppDTO (CelcoinOperatorDTO vendorDTO) {
        OperatorDTO appDTO = new OperatorDTO();

        appDTO.setCategory(vendorDTO.getCategory());
        appDTO.setName(vendorDTO.getName());
        appDTO.setMaxValue(appDTO.getMaxValue());
        appDTO.setMinValue(appDTO.getMinValue());
        appDTO.setProviderId(appDTO.getProviderId());
        appDTO.setRechargeType(appDTO.getRechargeType());

        return appDTO;
    }
}
