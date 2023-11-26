    package org.walker.tech.pix.infra.panache;

    import java.math.BigDecimal;

    import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
    import jakarta.persistence.*;

   @Entity
@Table(name = "fgz_pix")
public class PanachePix extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String qrcode;

    @Column
    private String key;

    @OneToOne(cascade = CascadeType.ALL)
    private PanacheMerchant merchant;

    @Column
    private String description;

    @Column
    private BigDecimal amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public PanacheMerchant getMerchant() {
        return merchant;
    }

    public void setMerchant(PanacheMerchant merchant) {
        this.merchant = merchant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void persistAndFlush() {
        persist();
        flush();
    }
    
    // Getters e Setters
}
