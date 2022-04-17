package com.tienda.unbosque.tienda.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "variant")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Variant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Variant_id", nullable = false)
    private Long VariantId;

    @Column(name = "Variant_name", nullable = false)
    private String variantName;

    @Column(name = "Variant_description", nullable = false)
    private String variantDescription;

    @Column(name = "Variant_price", nullable = false)
    private String variantPrice;

    @Column(name = "Variant_stock", nullable = false)
    private String variantStock;

    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    private Product product;
*/
    public Variant(){}

    public Variant(Long variantId, String variantName, String variantDescription, String variantPrice, String variantStock) {
        VariantId = variantId;
        this.variantName = variantName;
        this.variantDescription = variantDescription;
        this.variantPrice = variantPrice;
        this.variantStock = variantStock;
    }

    public Long getVariantId() {
        return VariantId;
    }

    public void setVariantId(Long variantId) {
        VariantId = variantId;
    }

    public String getVariantName() {
        return variantName;
    }

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    public String getVariantPrice() {
        return variantPrice;
    }

    public void setVariantPrice(String variantPrice) {
        this.variantPrice = variantPrice;
    }

    public String getVariantStock() {
        return variantStock;
    }

    public void setVariantStock(String variantStock) {
        this.variantStock = variantStock;
    }
}
