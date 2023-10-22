package domain.entities;

public class PhoneBO {
    Integer stateCode;
    Integer countryCode;
    String number;
    
    public PhoneBO(Integer stateCode, Integer countryCode, String number) {
        this.stateCode = stateCode;
        this.countryCode = countryCode;
        this.number = number;
    }
    
    public Integer getStateCode() {
        return stateCode;
    }
    public Integer getCountryCode() {
        return countryCode;
    }
    public String getNumber() {
        return number;
    }
}
