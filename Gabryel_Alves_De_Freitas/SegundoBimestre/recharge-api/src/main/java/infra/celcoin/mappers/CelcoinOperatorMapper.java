package infra.celcoin.mappers;

import domain.dto.OperatorDTO;
import infra.celcoin.dto.CelcoinOperatorDTO;

public class CelcoinOperatorMapper {
   public static OperatorDTO toAppDTO(CelcoinOperatorDTO vendorDTO){
        OperatorDTO appDTO = new OperatorDTO();
        
        appDTO.setCategory(vendorDTO.getCategory());
        appDTO.setMinValue(vendorDTO.getMaxValue());
        appDTO.setMinValue(vendorDTO.getMinValue());
        appDTO.setName(vendorDTO.getName());
        appDTO.setOperatorId(vendorDTO.getProdiverId());

        return appDTO;
   }
}
