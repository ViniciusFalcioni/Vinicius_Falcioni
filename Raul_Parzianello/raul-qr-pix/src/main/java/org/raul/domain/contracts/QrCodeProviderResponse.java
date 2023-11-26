package org.raul.domain.contracts;

public class QrCodeProviderResponse {
    private String response;

    private Integer transactionId;

    public QrCodeProviderResponse(String response, Integer transactionId) {
        this.response = response;
        this.transactionId = transactionId;
    }

    public String getResponse() {
        return response;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

}
