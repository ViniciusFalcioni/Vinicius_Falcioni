package com.github.faening.infra.celcoin.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(hidden = true)
public class CelcoinMerchantDTO {
    private String postalCode;
    private String city;
    private String merchantCategoryCode;
    private String name;

    public CelcoinMerchantDTO(String postalCode, String city, String merchantCategoryCode, String name) {
        this.postalCode = postalCode;
        this.city = city;
        this.merchantCategoryCode = merchantCategoryCode;
        this.name = name;
    }

    public CelcoinMerchantDTO() { }

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

    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
