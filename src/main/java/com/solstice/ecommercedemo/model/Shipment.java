package com.solstice.ecommercedemo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
    private Account account;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address adddress;

    @ManyToOne
    @JoinColumn(name ="orderNumber")
    private Order order;

    public Shipment() {
    }

    public Shipment(Date shippedDate, Date deliveredDate, Account account, Address adddress, Order order) {
        this.shippedDate = shippedDate;
        this.deliveredDate = deliveredDate;
        this.account = account;
        this.adddress = adddress;
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

//    public Account getAccount() {
//        return account;
//    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAdddress() {
        return adddress;
    }

    public void setAdddress(Address adddress) {
        this.adddress = adddress;
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
}
