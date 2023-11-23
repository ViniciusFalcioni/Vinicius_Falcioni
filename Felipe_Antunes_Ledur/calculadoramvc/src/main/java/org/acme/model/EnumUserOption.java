package org.acme.model;

public enum EnumUserOption {
    add(1, "Adicao"),
    subtract(2, "Subtracao"),
    multiply(3, "Multiplicacao"),
    divide(4, "Divisao");

    private Integer id;
    private String value;

    private EnumUserOption(Integer key, String value) {
        this.id = key;
        this.value = value;
    }

    public Integer getKey() {
        return this.id;
    }

    public String getValue() {
        return this.value;
    }

    public EnumUserOption getOption() {
        return this;
    }
}
