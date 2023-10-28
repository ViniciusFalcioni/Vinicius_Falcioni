package br.com.fag.infra.celcoin.dto;

public class CelcoinPhoneDTO {
  private Integer stateCode;
  private Integer countryCode;
  private Integer number;

  public CelcoinPhoneDTO() {
  }

  public CelcoinPhoneDTO(Integer stateCode, Integer countryCode, Integer number) {
    this.stateCode = stateCode;
    this.countryCode = countryCode;
    this.number = number;
  }

  public Integer getStateCode() {
    return this.stateCode;
  }

  public void setStateCode(Integer stateCode) {
    this.stateCode = stateCode;
  }

  public Integer getCountryCode() {
    return this.countryCode;
  }

  public void setCountryCode(Integer countryCode) {
    this.countryCode = countryCode;
  }

  public Integer getNumber() {
    return this.number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }
}
