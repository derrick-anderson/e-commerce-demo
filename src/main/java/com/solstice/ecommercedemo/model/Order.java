package com.solstice.ecommercedemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNumber;
    private Date orderDate = new Date();
    private BigDecimal totalPrice;

    @OneToOne
    @JoinColumn(name = "addressId")
    @JsonIgnoreProperties(value = "account")
    private Address shippingAddress;

    @OneToMany
    @JoinColumn(name = "orderNumber")
    private List<LineItem> lineItems;

    @OneToMany
    @JoinColumn(name = "orderNumber")
    private List<Shipment> shipments;

    @ManyToOne
    @JoinColumn(name = "accountId")
    @JsonIgnoreProperties(value = "orders")
    private Account account;

    public Order() {
    }

    public Order(Date orderDate, BigDecimal totalPrice, Address shippingAddress, Account account, List<LineItem> lineItems, List<Shipment> shipments) {
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.shippingAddress = shippingAddress;
        this.lineItems = lineItems;
        this.shipments = shipments;
        this.account = account;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public List<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<Shipment> shipments) {
        this.shipments = shipments;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
