package br.com.fag.infra.panache.model;

import java.util.UUID;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

  @Column(name = "PHONE_NUMBER")
  private String phoneNumber;

  @Column(name = "RECEIPT", length = 4000)
  private String receipt;

  @Column(name = "TRANSACTIONID")
  private Long transactionId;

  @Column(name = "SUCCESS")
  private boolean success;

}
