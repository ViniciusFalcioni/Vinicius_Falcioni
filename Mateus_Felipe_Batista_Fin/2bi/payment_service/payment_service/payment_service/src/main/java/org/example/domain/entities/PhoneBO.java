package main.java.org.example.domain.entities;

public class PhoneBO {
    private Integer countryCode;
    private Integer stateCode;
    private String number;

    public Integer getStateCode() {
        return stateCode;
    }

    public Integer getCountryCode() {
        return countryCode;
    }


    public String getNumber() {
        return number;
    }

    public PhoneBO(Integer countryCode, Integer stateCode, String number) {
        this.countryCode = countryCode;
        this.stateCode = stateCode;
        this.number = number;
    }
}
