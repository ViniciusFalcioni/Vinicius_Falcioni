package org.example.infra.celcoin.dto;

public class CelcoinMerchantDTO {
    private String name;
    private String postalCode;
    private String city;
    private Integer merchantCategoryCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public Integer getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(Integer merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }
}
