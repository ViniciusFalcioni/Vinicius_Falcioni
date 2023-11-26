package com.fag.infra.celcoin.dto.recharge;

public class CelcoinRechargeDTO {
  private String cpfCpnj;
  private Integer providerId;
  private CelcoinPhoneDTO phone;
  private CelcoinRechargeValueDTO topupData;

  public String getCpfCpnj() {
    return cpfCpnj;
  }

  public void setCpfCpnj(String cpfCpnj) {
    this.cpfCpnj = cpfCpnj;
  }

  public Integer getProviderId() {
    return providerId;
  }

  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
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
