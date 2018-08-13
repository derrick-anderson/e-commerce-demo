package com.solstice.ecommercedemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shipments")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shipmentId;
    private Date shippedDate = new Date();
    private Date deliveredDate;

    @OneToOne
    @JoinColumn(name = "accountId")
    @JsonIgnoreProperties(value = "orders")
    private Account account;

    @OneToOne
    @JoinColumn(name = "addressId")
    @JsonIgnoreProperties(value = "account")
    private Address address;

    @ManyToOne
    @JoinColumn(name ="orderNumber")
    @JsonIgnoreProperties(value = {"shipments", "lineItems"})
    private Order order;

    @OneToMany
    @JoinColumn(name = "shipment")
    @JsonIgnoreProperties(value = "shipment")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<LineItem> lineItems;

    public Shipment() {
    }

    public Shipment(Date shippedDate, Date deliveredDate, Account account, Address address, Order order) {
        this.shippedDate = shippedDate;
        this.deliveredDate = deliveredDate;
        this.account = account;
        this.address = address;
        this.order = order;
    }

//    public Order getOrder() {
//        return order;
//    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Date getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(Date deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }
}
