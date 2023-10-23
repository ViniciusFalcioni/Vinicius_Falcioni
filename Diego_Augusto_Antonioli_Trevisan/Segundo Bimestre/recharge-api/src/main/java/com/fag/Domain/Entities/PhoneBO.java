package com.fag.Domain.Entities;

public class PhoneBO {
    private int stateCode;
    private int countryCode;
    private String number;

    public PhoneBO(int stateCode, int countryCode, String number) {
        this.stateCode = stateCode;
        this.countryCode = countryCode;
        this.number = number;
    }

    /**
     * @return int return the stateCode
     */
    public int getStateCode() {
        return stateCode;
    }

    /**
     * @return int return the countryCode
     */
    public int getCountryCode() {
        return countryCode;
    }

    /**
     * @return String return the number
     */
    public String getNumber() {
        return number;
    }

}
