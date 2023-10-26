package main.java.com.fag.domain.dto;

public class PhoneDTO {
    Integer stateCode;
    Integer CountryCode;
    String number;

    public Integer getStateCode() {
        return stateCode;
    }
    public void setStateCode(Integer stateCode) {
        this.stateCode = stateCode;
    }
    public Integer getCountryCode() {
        return CountryCode;
    }
    public void setCountryCode(Integer countryCode) {
        CountryCode = countryCode;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
