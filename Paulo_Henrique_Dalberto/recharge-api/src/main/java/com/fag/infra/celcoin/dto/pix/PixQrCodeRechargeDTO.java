package com.fag.infra.celcoin.dto.pix;

public class PixQrCodeRechargeDTO {
  private String cpfCnpj;
  private Integer providerId;
  private PixQrCodePhoneDTO phone;
  private PixQrCodeRechargeValueDTO topupData;

  public String getCpfCpnj() {
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

  public PixQrCodePhoneDTO getPhone() {
    return phone;
  }

  public void setPhone(PixQrCodePhoneDTO phone) {
    this.phone = phone;
  }

  public PixQrCodeRechargeValueDTO getTopupData() {
    return topupData;
  }

  public void setTopupData(PixQrCodeRechargeValueDTO topupData) {
    this.topupData = topupData;
  }

  
}
