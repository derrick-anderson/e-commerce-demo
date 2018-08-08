package com.solstice.ecommercedemo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Currency;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderNumber;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "total_price")
    private Currency totalPrice;

    @OneToOne
    @JoinColumn(name = "address_id")
    @Column(name = "shipping_address")
    private Address shippingAddress;

    public Order() {
    }

    public Order(LocalDate orderDate, Currency totalPrice, Address shippingAddress) {
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.shippingAddress = shippingAddress;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Currency getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Currency totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
