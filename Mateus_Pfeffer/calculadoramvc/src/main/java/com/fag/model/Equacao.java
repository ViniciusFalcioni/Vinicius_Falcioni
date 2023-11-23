package com.fag.model;

import java.math.BigDecimal;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Equacao extends PanacheEntity {

    @Column(length = 14, nullable = false)
    private BigDecimal value1;

    @Column(length = 14, nullable = false)
    private BigDecimal value2;

    @Column(length = 14, nullable = false)
    private EnumOperation operation;

    @Column(length = 14, nullable = false)
    private BigDecimal result;

    public BigDecimal getValue1() {
        return value1;
    }

    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }

    public BigDecimal getValue2() {
        return value2;
    }

    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }

    public EnumOperation getOperation() {
        return operation;
    }

    public void setOperation(EnumOperation operation) {
        this.operation = operation;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }
}
