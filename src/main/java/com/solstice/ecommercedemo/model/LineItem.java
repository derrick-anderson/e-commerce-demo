package com.solstice.ecommercedemo.model;

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
    private BigDecimal totalPrice;

    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "shipmentId")
    private Shipment shipment;

    @ManyToOne
    @JoinColumn(name = "orderNumber")
    private Order order;


    public LineItem() {
    }

    public LineItem(Long quantity, BigDecimal price, BigDecimal totalPrice, Product product, Shipment shipment, Order order) {
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.product = product;
        this.shipment = shipment;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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
        return totalPrice;
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
