package main.java.com.fag.infra.panache.model;

@Entity
@table(name = "AKT_RECHARGE")
public class PanacheRecharge  extends PanacheEntityBase {
    @Id 
    private UUID id;

    @Column(name = "AMOUNT")
    private Double value;

    @Column(name = "DOCUMNET")
    private String document;

    @Column( name = "OPERATOR_ID")
    private INteger operatorId;

    @Column( name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column( name = "RECEIPT", length= 4000)
    private String receipt;

    @Column( name = "TRANSACTIONID")
    private Long transactionid;

    @Column( name = "SUCCESS")
    private Boolean success;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public INteger getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(INteger operatorId) {
        this.operatorId = operatorId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public Long getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(Long transactionid) {
        this.transactionid = transactionid;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
