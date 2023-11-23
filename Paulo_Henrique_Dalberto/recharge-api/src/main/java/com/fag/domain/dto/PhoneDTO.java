package com.fag.domain.dto;

public class PhoneDTO {
    private Integer stateCode;
    private Integer countryCode;
    private String number;
    


    /**
     * @return Integer return the stateCode
     */
    public Integer getStateCode() {
        return stateCode;
    }

    /**
     * @param stateCode the stateCode to set
     */
    public void setStateCode(Integer stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * @return Integer return the countryCode
     */
    public Integer getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return String return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }
}
