package com.fag.domain.dto;

public class OperatorDTO {
    Integer category;
    Integer RechargeType;
    String name;
    Integer providerId;
    Double maxValue;
    Double minValue;
    public Integer getCategory() {
        return category;
    }
    public void setCategory(Integer category) {
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getProviderId() {
        return providerId;
    }
    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }
    public Double getMaxValue() {
        return maxValue;
    }
    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }
    public Double getMinValue() {
        return minValue;
    }
    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Integer getRechargeType() {
        return RechargeType;
    }

    public void setRechargeType(Integer rechargeType) {
        RechargeType = rechargeType;
    }
}
