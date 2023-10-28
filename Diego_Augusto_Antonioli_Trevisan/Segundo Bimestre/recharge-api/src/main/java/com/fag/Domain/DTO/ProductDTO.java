package com.fag.Domain.DTO;

public class ProductDTO {
    private String name;
    private Double value;
    private int due;

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

    public int getDue() {
        return due;
    }

    public void setDue(int due) {
        this.due = due;
    }
}