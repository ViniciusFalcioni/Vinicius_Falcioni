package main.java.com.fag.domain.entities;

public class PhoneBO {
    Integer stateCode;
    Integer contryCode;
    String number;
    public Integer getStateCode() {
        return stateCode;
    }
    public Integer getContryCode() {
        return contryCode;
    }
    public String getNumber() {
        return number;
    }
    public PhoneBO(Integer stateCode, Integer contryCode, String number) {
        this.stateCode = stateCode;
        this.contryCode = contryCode;
        this.number = number;
    }
    
}
