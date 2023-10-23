package com.fag.Domain.DTO;

public class PhoneDTO {
    private int stateCode;
    private int countryCode;
    private String number;

    
    

    /**
     * @return int return the stateCode
     */
    public int getStateCode() {
        return stateCode;
    }

    /**
     * @param stateCode the stateCode to set
     */
    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * @return int return the countryCode
     */
    public int getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(int countryCode) {
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
