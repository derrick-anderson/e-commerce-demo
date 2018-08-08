package com.solstice.ecommercedemo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipment_id")
    private Long shipmentId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    @Column(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "address_id")
    @Column(name = "address_id")
    private Address adddress;

    @OneToMany
    @JoinColumn(name = "line_item_id")
    @Column(name = "line_items")
    private List<LineItem> lineItems;

    @Column(name = "date_shipped")
    private LocalDate shippedDate;

    @Column(name = "date_delivered")
    private LocalDate deliveredDate;


    public Shipment(Account account) {
        this.account = account;
    }

    public Shipment(Account account, Address adddress, List<LineItem> lineItems, LocalDate shippedDate, LocalDate deliveredDate) {
        this.account = account;
        this.adddress = adddress;
        this.lineItems = lineItems;
        this.shippedDate = shippedDate;
        this.deliveredDate = deliveredDate;
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

    public Address getAdddress() {
        return adddress;
    }

    public void setAdddress(Address adddress) {
        this.adddress = adddress;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public LocalDate getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(LocalDate shippedDate) {
        this.shippedDate = shippedDate;
    }

    public LocalDate getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(LocalDate deliveredDate) {
        this.deliveredDate = deliveredDate;
    }
}
