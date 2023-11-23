package com.fag.domain.entities;

public class PhoneBO {
    private Integer stateCode;
    private Integer countryCode;
    private String number;


    public PhoneBO(Integer stateCode, Integer countryCode, String number) {
        this.stateCode = stateCode;
        this.countryCode = countryCode;
        this.number = number;
    }

    

    /**
     * @return Integer return the stateCode
     */
    public Integer getStateCode() {
        return stateCode;
    }

    /**
     * @return Integer return the countryCode
     */
    public Integer getCountryCode() {
        return countryCode;
    }

    /**
     * @return String return the number
     */
    public String getNumber() {
        return number;
    }
}
