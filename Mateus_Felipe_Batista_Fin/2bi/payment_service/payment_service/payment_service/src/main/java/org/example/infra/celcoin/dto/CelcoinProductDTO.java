package main.java.org.example.infra.celcoin.dto;

import java.math.BigDecimal;

public class CelcoinProductDTO {
    private Integer code;
    private Integer cost;
    private Integer dueProduct;
    private String productName;
    private BigDecimal minValue;

    public BigDecimal getMinValue() {
        return minValue;
    }

    public void setMinValue(BigDecimal minValue) {
        this.minValue = minValue;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getDueProduct() {
        return dueProduct;
    }

    public void setDueProduct(Integer dueProduct) {
        this.dueProduct = dueProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}
