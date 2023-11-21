package com.fag.domain.entities;

public class MerchantBO {
    private String postalCode;
    private String city;
    private Boolean category;
    private String name;

    public MerchantBO(String postalCode, String city, Boolean category, String name) {
        this.postalCode = postalCode;
        this.city = city;
        this.category = category;
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getCategory() {
        return category;
    }

    public void setCategory(Boolean category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
