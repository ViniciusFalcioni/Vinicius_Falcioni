package main.java.com.fag.infra.celcoin.mappers;

public class CelcoinRechargeMapper {
    private String cpfCnpj;
    private Integer providerId;
    private CeloinPhoneDTO phone;
    private CelcoinRechargeValueDTO topupData;

    public String getCpfCnpj() {
        return cpfCnpj;
    }
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
    public Integer getProviderId() {
        return providerId;
    }
    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }
    public Celoin getPhoneDTO() {
        return PhoneDTO;
    }
    public void setPhoneDTO(Celoin phoneDTO) {
        PhoneDTO = phoneDTO;
    }
    public CelcoinRechargeValueDTO getTopupData() {
        return topupData;
    }
    public void setTopupData(CelcoinRechargeValueDTO topupData) {
        this.topupData = topupData;
    }
}
