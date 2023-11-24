package com.fag.infra.celcoin.dto;

public class CelcoinOperatorDTO {
    private Integer category;
    private Integer rechargeType;
    private Integer providerId;
    private String name;
    private double maxValue;
    private double minValue;
    
    public Integer getCategory() {
        return category;
    }
    public void setCategory(Integer category) {
        this.category = category;
    }
    public Integer getRechargeType() {
        return rechargeType;
    }
    public void setRechargeType(Integer rechargeType) {
        this.rechargeType = rechargeType;
    }
    public Integer getProviderId() {
        return providerId;
    }
    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMaxValue() {
        return maxValue;
    }
    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }
    public double getMinValue() {
        return minValue;
    }
    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    
}
