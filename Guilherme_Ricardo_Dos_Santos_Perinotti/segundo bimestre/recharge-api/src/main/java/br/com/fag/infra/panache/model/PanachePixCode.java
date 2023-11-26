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
@Table(name = "AKT_PIX_CODE")
public class PanachePixCode extends PanacheEntityBase {

  @Id
  private UUID id;

  @Column(name = "TRANSACTION_ID")
  private Long transactionId;

  @Column(name = "EMV")
  private String emvqrcps;

  @Column(name = "KEY")
  private String key;

  @Column(name = "AMOUNT")
  private Double amount;
  
}
