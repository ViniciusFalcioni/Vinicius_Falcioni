package org.apicellcoin.infra.celcoin.dto;

public class CelcoinBase64QRCodeDTO {
    private int status;
    private String base64image;

    // Getters e Setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBase64Image() {
        return base64image;
    }

    public void setBase64Image(String base64image) {
        this.base64image = base64image;
    }
}