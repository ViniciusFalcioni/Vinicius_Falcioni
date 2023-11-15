package main.java.com.fag.infra.celcoin.dto;

public class CelcoinOperatorDTO {
    private Iinterger category;
    private String name;
    private Integer rechargeType;
    private Integer providerId;
    private Double maxValue;
    private Double minValue;
    
    public Iinterger getCategory() {
        return category;
    }
    public void setCategory(Iinterger category) {
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
}
