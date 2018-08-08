package com.solstice.ecommercedemo.model;

import javax.persistence.*;
import java.util.Currency;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNumber;
    private Date orderDate;
    private Currency totalPrice;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address shippingAddress;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;

    public Order() {
    }

    public Order(Date orderDate, Currency totalPrice, Address shippingAddress, Account account) {
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.shippingAddress = shippingAddress;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
