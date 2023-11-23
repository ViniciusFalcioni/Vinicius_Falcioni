package com.fag.enums;

public enum EnumUserOption {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String value;

    EnumUserOption(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

