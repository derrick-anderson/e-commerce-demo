package com.solstice.ecommercedemo.model;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    private String street;
    private String unit;
    private String city;

    @Column(name = "state_or_province")
    private String stateOrProvince;
    private String country;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Address() {
    }

    public Address(String street, String unit, String city, String stateOrProvince, String country, Account account) {
        this.street = street;
        this.unit = unit;
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.country = country;
        this.account = account;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
