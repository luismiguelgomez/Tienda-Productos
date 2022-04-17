package com.tienda.unbosque.tienda.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "product")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_id", nullable = false)
    private Long ProductId;
    @Column(name = "Product_name" , nullable = false)
    private String ProductName;
    @Column(name = "Product_category", nullable = false)
    private String ProductCategory;
    @Column(name = "Product_brand", nullable = false)
    private String productBrand;
    @Column(name = "Product_stock", nullable = false )
    private String productStock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Provider_id", nullable = false)
    private Provider provider;

    public Product(){}

    public Product(Long productId, String productName, String productCategory, String productBrand, String productStock, Provider provider) {
        ProductId = productId;
        ProductName = productName;
        ProductCategory = productCategory;
        this.productBrand = productBrand;
        this.productStock = productStock;
        this.provider = provider;
    }

    public Long getProductId() {
        return ProductId;
    }

    public void setProductId(Long productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductStock() {
        return productStock;
    }

    public void setProductStock(String productStock) {
        this.productStock = productStock;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
