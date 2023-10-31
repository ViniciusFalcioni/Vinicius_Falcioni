public class RechargeBO
{
    UUID id;
    Double value;
    String document;
    Integer operatorId;
    PhoneBO phone;
    String receipt;
    Long transactionId;
    boolean success;

    public UUID getId() {
        return id;
    }
    public Double getValue() {
        return value;
    }
    public String getDocument() {
        return document;
    }
    public Integer getOperatorId() {
        return operatorId;
    }
    public PhoneBO getPhone() {
        return phone;
    }
    public String getReceipt() {
        return receipt;
    }
    public Long getTransactionId() {
        return transactionId;
    }
    public boolean isSuccess() {
        return success;
    }
    
    public RechargeBO(UUID id, Double value, String document, Integer operatorId, PhoneBO phone, String receipt,
            Long transactionId, boolean success) {
        this.id = id;
        this.value = value;
        this.document = document;
        this.operatorId = operatorId;
        this.phone = phone;
        this.receipt = receipt;
        this.transactionId = transactionId;
        this.success = success;
    }
 
    
    
}
