package org.example.infra.celcoin.dto;

public class CelcoinRechargeDTO {
    private String cpfCnpj;
    private Integer providerld;
    private CelcoinPhoneDTO phone;
    private CelcoinRechargeValueDTO topupData;

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Integer getProviderld() {
        return providerld;
    }

    public void setProviderld(Integer providerld) {
        this.providerld = providerld;
    }

    public CelcoinPhoneDTO getPhone() {
        return phone;
    }

    public void setPhone(CelcoinPhoneDTO phone) {
        this.phone = phone;
    }

    public CelcoinRechargeValueDTO getTopupData() {
        return topupData;
    }

    public void setTopupData(CelcoinRechargeValueDTO topupData) {
        this.topupData = topupData;
    }
}
