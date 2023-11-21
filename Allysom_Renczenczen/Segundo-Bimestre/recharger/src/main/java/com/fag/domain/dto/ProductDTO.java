package com.fag.domain.dto;

public class ProductDTO {
    private Integer code;
    private Integer cost;
    private Integer due;
    private String name;
    private Double value;



    public Integer getDue() {
        return due;
    }

    public void setDue(Integer due) {
        this.due = due;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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
}
