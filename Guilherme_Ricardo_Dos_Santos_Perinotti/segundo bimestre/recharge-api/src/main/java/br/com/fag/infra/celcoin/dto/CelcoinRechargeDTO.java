package br.com.fag.infra.celcoin.dto;

public class CelcoinRechargeDTO {
  private String cpfOrCnpj;
  private Integer providerId;
  private CelcoinPhoneDTO phone;
  private CelcoinRechargeValueDTO topupData;

  public CelcoinRechargeDTO() {
  }

  public CelcoinRechargeDTO(String cpfOrCnpj, Integer providerId, CelcoinPhoneDTO phone, CelcoinRechargeValueDTO topupData) {
    this.cpfOrCnpj = cpfOrCnpj;
    this.providerId = providerId;
    this.phone = phone;
    this.topupData = topupData;
  }

  public String getCpfOrCnpj() {
    return this.cpfOrCnpj;
  }

  public void setCpfOrCnpj(String cpfOrCnpj) {
    this.cpfOrCnpj = cpfOrCnpj;
  }

  public Integer getProviderId() {
    return this.providerId;
  }

  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }

  public CelcoinPhoneDTO getPhone() {
    return this.phone;
  }

  public void setPhone(CelcoinPhoneDTO phone) {
    this.phone = phone;
  }

  public CelcoinRechargeValueDTO getTopupData() {
    return this.topupData;
  }

  public void setTopupData(CelcoinRechargeValueDTO topupData) {
    this.topupData = topupData;
  }

}
