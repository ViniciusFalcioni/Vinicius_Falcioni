package com.fag.infra.panache.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "AKT_RECHARGE")
public class PanacheRecharge extends PanacheEntityBase {
    @Id
    private UUID id;
    @Column(name = "AMOUNT")
    private Double value;
    @Column(name = "DOCUMENT")
    private String document;
    @Column(name = "OPERATOR_ID")
    private Integer operatorId;

}
