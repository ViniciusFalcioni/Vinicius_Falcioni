package org.example.infra.celcoin.dto;

import java.math.BigDecimal;

public class CelcoinOperatorDTO {
    private Integer category;
    private Integer rechargeType;
    private String name;
    private Integer providerld;
    private BigDecimal maxValue;
    private BigDecimal minValue;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProviderld() {
        return providerld;
    }

    public void setProviderld(Integer providerld) {
        this.providerld = providerld;
    }

    public BigDecimal getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(BigDecimal maxValue) {
        this.maxValue = maxValue;
    }

    public BigDecimal getMinValue() {
        return minValue;
    }

    public void setMinValue(BigDecimal minValue) {
        this.minValue = minValue;
    }
}
