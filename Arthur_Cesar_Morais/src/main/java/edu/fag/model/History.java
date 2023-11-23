package edu.fag.model;

import jakarta.persistence.*;

import java.util.Date;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "history")
public class History extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @Column
    private String expression;

    @Column
    private double result;

    public History() { }

    public History(Date timestamp, String expression, double result) {
        this.timestamp = timestamp;
        this.expression = expression;
        this.result = result;
    }

    public History(Long id, Date timestamp, String expression, double result) {
        this.id = id;
        this.timestamp = timestamp;
        this.expression = expression;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
