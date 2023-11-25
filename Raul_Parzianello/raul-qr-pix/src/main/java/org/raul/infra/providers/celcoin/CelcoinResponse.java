package org.raul.infra.providers.celcoin;

public class CelcoinResponse {
    private Integer transactionId;

    private String emvqrcps;

    private String transactionIdentification;

    public Integer getTransactionId() {
        return transactionId;
    }

    public String getEmvqrcps() {
        return emvqrcps;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

}
