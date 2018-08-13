package com.solstice.ecommercedemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "lineItems")
public class LineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lineItemId;

    private Long quantity;
    private BigDecimal price;

    @Transient
    private BigDecimal totalPrice;

    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "shipment")
    @JsonIgnoreProperties(value = "lineItems")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Shipment shipment;

    @ManyToOne
    @JoinColumn(name = "orderNumber")
    private Order orderNumber;


    public LineItem() {
    }

    public LineItem(Long quantity, BigDecimal price, BigDecimal totalPrice, Product product, Shipment shipment, Order orderNumber) {
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.product = product;
        this.shipment = shipment;
        this.orderNumber = orderNumber;
    }

//    public Order getOrderNumber() {
//        return orderNumber;
//    }

    public void setOrderNumber(Order orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(Long lineItemId) {
        this.lineItemId = lineItemId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {

        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getTotalPrice() {
        return this.price.multiply(BigDecimal.valueOf(this.quantity));
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

}
