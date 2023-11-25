package org.example.domain.entities;

public class MerchantBO {
    private String name;
    private String postalCode;
    private String city;
    private Integer category;

    public String getName() {
        return name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public Integer getCategory() {
        return category;
    }

    public MerchantBO(String name, String postalCode, String city, Integer category) {
        this.name = name;
        this.postalCode = postalCode;
        this.city = city;
        this.category = category;
    }
}
