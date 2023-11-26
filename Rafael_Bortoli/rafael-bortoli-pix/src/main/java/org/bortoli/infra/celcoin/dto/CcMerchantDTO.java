package org.bortoli.infra.celcoin.dto;

public class CcMerchantDTO {
    private String merchantCategoryCode;
    private String postalCode;
    private String city;
    private String name;

    public String getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getCity() {
        return this.city;
    }

    public String getName() {
        return this.name;
    }

    public void setMerchantCategoryCode(final String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
