package org.diego.domain.contracts;

public class AddQrCodeResponse {
    private String base64;

    private Double amount;

    public AddQrCodeResponse(String base64, Double amount) {
        this.base64 = base64;
        this.amount = amount;
    }

    public String getBase64() {
        return base64;
    }

    public Double getAmount() {
        return amount;
    }

}
