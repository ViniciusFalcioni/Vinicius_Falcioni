package main.java.com.fag.domain.dto;

public class OperatorDTO {
    private integer category;
    private String name;
    private integer providerld;
    private Double maxValue;
    private Double minValue;
    
    public integer getCategory() {
        return category;
    }
    public void setCategory(integer category) {
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public integer getProviderld() {
        return providerld;
    }
    public void setProviderld(integer providerld) {
        this.providerld = providerld;
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
