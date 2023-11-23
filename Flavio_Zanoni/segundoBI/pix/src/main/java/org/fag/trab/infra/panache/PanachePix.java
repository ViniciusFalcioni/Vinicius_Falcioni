package org.fag.trab.infra.panache;

import io.quarkus.Generated;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.IdentityHashMap;
import java.util.UUID;

@Entity
@Table(
        name = "fgz_pix"
)
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

    public PanacheMerchant getMerchant() {
        return merchant;
    }

    public void setMerchant(PanacheMerchant merchant) {
        this.merchant = merchant;
    }

    public Long getId() {
        return this.id;
    }

    public String getQrcode() {
        return this.qrcode;
    }

    public String getKey() {
        return this.key;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setQrcode(final String qrcode) {
        this.qrcode = qrcode;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }
}
