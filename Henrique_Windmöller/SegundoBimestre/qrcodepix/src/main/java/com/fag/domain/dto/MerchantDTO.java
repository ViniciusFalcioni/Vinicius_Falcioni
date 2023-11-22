package com.fag.domain.dto;

public class MerchantDTO {

    private String postalCode;

    private String city;

    private Integer CategoryCode;

    private String name;

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryCode() {
        return CategoryCode;
    }

    public void setCategoryCode(Integer categoryCode) {
        CategoryCode = categoryCode;
    }

    
    
}