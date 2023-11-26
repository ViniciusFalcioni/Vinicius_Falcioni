package com.fag.infra.celcoin.dto;


public class CelcoinOperatorDTO {
    
    private Integer category;
    private Integer rechargeType;
    private String name;
    private Integer providerId;
    private Double maxValue;
    private Double minValue;

    public Integer getCategory() {
        return category;
    }
    public Integer getRechargeType() {
        return rechargeType;
    }
    public String getName() {
        return name;
    }
    public Integer getProviderId() {
        return providerId;
    }
    public Double getMaxValue() {
        return maxValue;
    }
    public Double getMinValue() {
        return minValue;
    }
    
    public void setCategory(Integer category) {
        this.category = category;
    }
    public void setRechargeType(Integer rechargeType) {
        this.rechargeType = rechargeType;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }
    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }
    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }
    
    
}
