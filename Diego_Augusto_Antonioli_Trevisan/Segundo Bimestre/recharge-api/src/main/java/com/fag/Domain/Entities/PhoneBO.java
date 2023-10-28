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

    public int getStateCode() {
        return stateCode;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public String getNumber() {
        return number;
    }
}