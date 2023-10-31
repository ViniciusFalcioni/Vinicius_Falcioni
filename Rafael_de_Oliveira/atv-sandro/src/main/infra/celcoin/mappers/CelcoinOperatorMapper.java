public class CelcoinOperatorMapper 
{
    public static OperatorDTO toAppDTO(CelcoinOperatorDTO vendorDTO)
    {
        OperadorDTO appDTO = new OperatorDTO();

        appDTO.setCategory(vendorDTO.getCategory());
        appDTO.setMaxValue(vendorDTO.getMaxValue());
        appDTO.setMinValue(vendorDTO.getMinValue());
        appDTO.setName(vendorDTO.getName());
        appDTO.setProviderId(vendorDTO.getProviderId());
        appDTO.setRechargeType(vendorDTO.getRechargeType());

        return appDTO;
    }    
}
