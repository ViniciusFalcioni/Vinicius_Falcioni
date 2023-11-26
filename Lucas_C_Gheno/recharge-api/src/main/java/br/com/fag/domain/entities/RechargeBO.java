package br.com.fag.domain.entities;

import java.util.UUID;

import br.com.fag.domain.dto.CCoinPhoneDTO;

public class RechargeBO {
    private UUID id;
    private Double value;
    private String document;
    private Integer providerId;
    private CCoinPhoneDTO phone;

    public RechargeBO() {
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDocument() {
        return this.document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Integer getProviderId() {
        return this.providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public CCoinPhoneDTO getPhone() {
        return this.phone;
    }

    public void setPhone(CCoinPhoneDTO phone) {
        this.phone = phone;
    }
}