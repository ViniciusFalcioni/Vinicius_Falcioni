package com.fag.infra.celcoin.dto;

public class CelcoinPhoneDTO {
    private Integer stateCode;

    private Integer countryCode;

    private String number;

    public Integer getStateCode() {
        return stateCode;
    }

    public void setStateCode(Integer stateCode) {
        this.stateCode = stateCode;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Integer countryCod) {
        this.countryCode = countryCod;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    
}
