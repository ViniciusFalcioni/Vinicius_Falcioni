package com.aktie.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rafaeldeoliveira_pix")
public class PixBO {
    
    @Id
    private UUID id;

    @Column
    private BigDecimal amount;

    @Column(length = 1000)
    private String email;

    @Column(length = 1000)
    private String description;

    @Column(length = 1000)
    private String emv;

    @Column(length = 1000)
    private String base64;

    @Column
    private LocalDateTime expiration;

    public PixBO(String id, BigDecimal amount, String email, String description,
                 String emv, String base64, LocalDateTime expiration) {
        this.id = id != null ? UUID.fromString(id) : UUID.randomUUID();
        this.amount = amount;
        this.email = email;
        this.description = description;
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;

        validate();
    }
    
    public void validate() {
        // validação -- exceção
    }

    public void updateEmvData(String emv, String base64, LocalDateTime expiration) {
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;
    }

    public UUID getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public String getEmv() {
        return emv;
    }

    public String getBase64() {
        return base64;
    }

    public LocalDateTime getExpiration() {
        return expiration;
    }

}
