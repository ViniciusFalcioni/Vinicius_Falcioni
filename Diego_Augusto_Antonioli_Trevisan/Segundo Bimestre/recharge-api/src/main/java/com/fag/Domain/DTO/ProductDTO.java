package com.fag.Domain.DTO;

public class ProductDTO {
    private String name;
    private Double value;
    private int due;
    
    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Double return the value
     */
    public Double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * @return int return the due
     */
    public int getDue() {
        return due;
    }

    /**
     * @param due the due to set
     */
    public void setDue(int due) {
        this.due = due;
    }

}
