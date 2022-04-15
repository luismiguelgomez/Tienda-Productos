package com.tienda.unbosque.tienda.models;

import javax.persistence.*;

@Entity
@Table(name = "provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Provider_id", nullable = false)
    private Long providerId;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "Provider_doctype", nullable = false)
    private Doctype doctype;
    public enum Doctype {
        CC,
        CE,
        NIT;
    }

    @Column(name = "Provider_name", nullable = false)
    private String providerName;

    @Column(name = "Provider_phone", nullable = false)
    private String providerPhone;

    @Column(name = "Provider_email", nullable = false)
    private String providerEmail;

    @Column(name = "Provider_address", nullable = false)
    private String providerAddress;

    @Column(name = "Provider_city", nullable = false)
    private String providerCity;

    @Column(name = "Provider_pw", nullable = false)
    private String providerPw;

    public Provider(){}

    public Provider(Long providerId, Doctype doctype, String providerName, String providerPhone, String providerEmail, String providerAddress, String providerCity, String providerPw) {
        this.providerId = providerId;
        this.doctype = doctype;
        this.providerName = providerName;
        this.providerPhone = providerPhone;
        this.providerEmail = providerEmail;
        this.providerAddress = providerAddress;
        this.providerCity = providerCity;
        this.providerPw = providerPw;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public void setDoctype(Doctype doctype) {
        this.doctype = doctype;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public void setProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
    }

    public void setProviderEmail(String providerEmail) {
        this.providerEmail = providerEmail;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }

    public void setProviderCity(String providerCity) {
        this.providerCity = providerCity;
    }

    public void setProviderPw(String providerPw) {
        this.providerPw = providerPw;
    }

    public Long getProviderId() {
        return providerId;
    }

    public Doctype getDoctype() {
        return doctype;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getProviderPhone() {
        return providerPhone;
    }

    public String getProviderEmail() {
        return providerEmail;
    }

    public String getProviderAddress() {
        return providerAddress;
    }

    public String getProviderCity() {
        return providerCity;
    }

    public String getProviderPw() {
        return providerPw;
    }
}
