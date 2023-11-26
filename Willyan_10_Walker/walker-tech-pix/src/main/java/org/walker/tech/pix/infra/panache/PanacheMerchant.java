    package org.walker.tech.pix.infra.panache;

    import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

    @Entity
    @Table(name = "fgz_merchant")
    public class PanacheMerchant extends PanacheEntityBase {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String name;

        @Column(name = "postal_code")
        private String postalCode;

        @Column
        private String city;

        public PanacheMerchant(String name2, String postalCode2, String city2) {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        // Getters e Setters
    }
